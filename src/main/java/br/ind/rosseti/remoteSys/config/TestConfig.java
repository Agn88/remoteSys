package br.ind.rosseti.remoteSys.config;


import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.ind.rosseti.remoteSys.entities.Machine;
import br.ind.rosseti.remoteSys.entities.MachineDetail;
import br.ind.rosseti.remoteSys.entities.User;
import br.ind.rosseti.remoteSys.entities.UserMachine;
import br.ind.rosseti.remoteSys.repositories.MachineDetailRepository;
import br.ind.rosseti.remoteSys.repositories.MachineRepository;
import br.ind.rosseti.remoteSys.repositories.UserMachineRepository;
import br.ind.rosseti.remoteSys.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private MachineDetailRepository machineDetailRepository;
	
	@Autowired
	private MachineRepository machineRepository;
	
	@Autowired
	private UserMachineRepository userMachineRepository;
	
	@Override
	public void run(String... args) throws Exception {
	
		User user1 = new User(null, "Agnaldo", "49999108458", "agnaldo@rosseti.ind.br", "5544690", "5");
		User user2 = new User(null, "Cassiano", "49999108458", "cassiano@rosseti.ind.br", "5544690", "2");
		User user3 = new User(null, "André", "49999108458", "andre@rosseti.ind.br", "5544690", "2");
		
		userRepository.saveAll(Arrays.asList(user1, user2, user3));
		
		
		
		Machine machine1 = new Machine(
				null, 
				"Luz Biomassa", 
				"192.168.20.76", 
				Instant.parse("2019-06-20T19:53:07Z"), 
				Instant.parse("2019-06-20T19:53:07Z"), 
				Instant.parse("2019-06-20T19:53:07Z"), 
				"", 
				"PLT200106P-605");
		
		Machine machine2 = new Machine(
				null, 
				"Sipal", 
				"192.168.20.76", 
				Instant.parse("2019-06-20T19:53:07Z"), 
				Instant.parse("2019-06-20T19:53:07Z"), 
				Instant.parse("2019-06-20T19:53:07Z"), 
				"", 
				"PLT200210P-609");
		
		Machine machine3 = new Machine(
				null, 
				"Elza Junqueira", 
				"192.168.20.76", 
				Instant.parse("2019-06-20T19:53:07Z"), 
				Instant.parse("2019-06-20T19:53:07Z"), 
				Instant.parse("2019-06-20T19:53:07Z"), 
				"", 
				"PLT200422P-618");
		
		machineRepository.saveAll(Arrays.asList(machine1, machine2, machine3));
		
		
		
		
		MachineDetail  machineDetail1 = new MachineDetail(
				null, 
				machine1,
				Instant.parse("2019-06-20T19:53:07Z"),
				"1.2",
				"2.3",
				"3.5",
				"4.8",
				"5.9",
				"6.7",
				"7.8",
				"8.4",
				"9.2",
				"10.6",
				"11.1",
				"12.1",
				"13.1"
				);
		
		MachineDetail  machineDetail2 = new MachineDetail(
				null, 
				machine2,
				Instant.parse("2019-06-20T19:53:07Z"),
				"1.2",
				"2.3",
				"3.5",
				"4.8",
				"5.9",
				"6.7",
				"7.8",
				"8.4",
				"9.2",
				"10.6",
				"11.1",
				"12.1",
				"13.1"
				);
		
		MachineDetail  machineDetail3 = new MachineDetail(
				null, 
				machine3,
				Instant.parse("2019-06-20T19:53:07Z"),
				"1.2",
				"2.3",
				"3.5",
				"4.8",
				"5.9",
				"6.7",
				"7.8",
				"8.4",
				"9.2",
				"10.6",
				"11.1",
				"12.1",
				"13.1"
				);
		
		machineDetailRepository.saveAll(Arrays.asList(machineDetail1, machineDetail2, machineDetail3));
		
		
		UserMachine userMachine1 = new UserMachine(machine1, user1);
		UserMachine userMachine2 = new UserMachine(machine2, user1);
		UserMachine userMachine3 = new UserMachine(machine2, user2);
		UserMachine userMachine4 = new UserMachine(machine3, user3);
		
		userMachineRepository.saveAll(Arrays.asList(userMachine1, userMachine2, userMachine3, userMachine4));
		
	}
}
