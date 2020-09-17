package br.ind.rosseti.remoteSys.rascunhos;

import java.util.Date;
import java.util.TimerTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.ind.rosseti.remoteSys.entities.Machine;
import br.ind.rosseti.remoteSys.entities.MachineDetail;
import br.ind.rosseti.remoteSys.repositories.MachineDetailRepository;
import br.ind.rosseti.remoteSys.repositories.MachineRepository;

@Order(value = 2)
@Component
public class ExecuteConnection implements CommandLineRunner {

	/*
	@Autowired
	private MachineRepository machineRepository;

	@Autowired
	private MachineDetailRepository machineDetailRepository;
	*/


	@Override
	public void run(String... arg0) throws Exception {
	
		
		/*
		long TEMPO = (1000 * 3); // chama o método a cada 3 segundos
		Timer timer = null;

		if (timer == null) {
			timer = new Timer();
			TimerTask tarefa = new TimerTask() {

				public void run() {
					try {
						// chama o método
						updateValues();

					} catch (Exception e) {
					}
				}
			};
			timer.scheduleAtFixedRate(tarefa, TEMPO, TEMPO);
		}
		*/

		/*
		 * for (Machine obj : machineRepository.findAll()) {
		 * 
		 * MachineDetail machineDetail = connectionCLP.Connect(obj);
		 * 
		 * machineDetailRepository.save(machineDetail);
		 * System.out.println("Inserido com sucesso");
		 * 
		 * }
		 */

		//System.out.println("Order 2: Executed is sucess.");

	}
 
	/*
	public void updateValues() {

		ConnectionCLP connectionCLP = new ConnectionCLP();

		for (Machine obj : machineRepository.findAll()) {

			MachineDetail machineDetail = connectionCLP.Connect(obj);

			machineDetailRepository.save(machineDetail);
			System.out.println("Inserido com sucesso");

		}
	}
	*/
}
