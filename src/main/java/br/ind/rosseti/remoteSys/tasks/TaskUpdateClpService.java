package br.ind.rosseti.remoteSys.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import br.ind.rosseti.remoteSys.communication.ConnectionCLP;
import br.ind.rosseti.remoteSys.entities.Machine;
import br.ind.rosseti.remoteSys.entities.MachineDetail;
import br.ind.rosseti.remoteSys.repositories.MachineDetailRepository;
import br.ind.rosseti.remoteSys.repositories.MachineRepository;

@Service
public class TaskUpdateClpService {

	@Scheduled(cron = "0 0/1 * 1/1 * ?")
	public void validateSomething() {
		updateValues();
	}
	
	
	@Autowired
	private MachineRepository machineRepository;

	@Autowired
	private MachineDetailRepository machineDetailRepository;
	
	public void updateValues() {

		ConnectionCLP connectionCLP = new ConnectionCLP();

		for (Machine obj : machineRepository.findAll()) {

			MachineDetail machineDetail = connectionCLP.Connect(obj);

			machineDetailRepository.save(machineDetail);

		}
	}
}