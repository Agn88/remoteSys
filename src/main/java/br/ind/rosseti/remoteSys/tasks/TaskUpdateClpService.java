package br.ind.rosseti.remoteSys.tasks;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import br.ind.rosseti.remoteSys.communication.ConnectionCLP;
import br.ind.rosseti.remoteSys.entities.Machine;
import br.ind.rosseti.remoteSys.entities.MachineDetail;
import br.ind.rosseti.remoteSys.repositories.MachineDetailRepository;
import br.ind.rosseti.remoteSys.repositories.MachineRepository;
import br.ind.rosseti.remoteSys.services.MachineService;

@Service
public class TaskUpdateClpService {

	@Autowired
	private MachineRepository machineRepository;

	@Autowired
	private MachineService machineService;

	@Autowired
	private MachineDetailRepository machineDetailRepository;

	@Scheduled(cron = "0 0/1 * 1/1 * ?")
	public void validateSomething() {
		updateValues();
	}

	
	
	
	/*
	 * Update and Insert values of CLP in Database
	 * Repeat interval 1 minute and next executation task
	 */
	public void updateValues() {

		ConnectionCLP connectionCLP = new ConnectionCLP();

		for (Machine obj : machineRepository.findAll()) {

			if (obj.getNextConnection().isBefore(Instant.now())) {

				MachineDetail machineDetail = connectionCLP.Connect(obj);

				if (machineDetail != null) {

					machineDetailRepository.save(machineDetail);
					obj.setLastConnection(Instant.now());
					obj.setNextConnection(addHours(Instant.now(), 30));
					obj.setCodeError("Ok");

				} else {

					obj.setLastError(Instant.now());
					obj.setNextConnection(addHours(Instant.now(), 10));
					obj.setCodeError("Failed");

				}

				machineService.update(obj);

			} else {
				System.out.println("Ok - Not demmanded - " + obj.getName() + " - Next Update: " + obj.getNextConnection());
			}

		}
	}

	public Instant addHours(Instant instant, long minutes) {
		Instant t1 = Instant.now();
		long hours = 0;
		Instant t2 = t1.plus(hours, ChronoUnit.HOURS).plus(minutes, ChronoUnit.MINUTES);

		return t2;
	}

}