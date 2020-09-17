package br.ind.rosseti.remoteSys.services;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.el.parser.ParseException;

import br.ind.rosseti.remoteSys.entities.Authoritie;
import br.ind.rosseti.remoteSys.entities.DetailUser;
import br.ind.rosseti.remoteSys.entities.Machine;
import br.ind.rosseti.remoteSys.entities.User;
import br.ind.rosseti.remoteSys.entities.UserMachine;
import br.ind.rosseti.remoteSys.repositories.AuthoritieRepository;
import br.ind.rosseti.remoteSys.repositories.DetailUserRepository;
import br.ind.rosseti.remoteSys.repositories.MachineDetailRepository;
import br.ind.rosseti.remoteSys.repositories.MachineRepository;
import br.ind.rosseti.remoteSys.repositories.UserLoginRepository;
import br.ind.rosseti.remoteSys.repositories.UserMachineRepository;

@Service
public class DBService {

	@Autowired
	private DetailUserRepository userRepository;
		
	@Autowired
	private MachineDetailRepository machineDetailRepository;
	
	@Autowired
	private MachineRepository machineRepository;
	
	@Autowired
	private UserMachineRepository userMachineRepository;
	
	@Autowired
	private AuthoritieRepository authoritieRepository;
	
	@Autowired
	private UserLoginRepository userLoginRepository;
	
	public void instantiateTestDatabase() throws ParseException {
		
		User login1 = new User("agnaldo", "$2y$12$RjGyK/e7j/A/19gUWlR8fOGF5cN6txEjas09Ft2zGeyf1b2jt8i96", true);
		userLoginRepository.saveAll(Arrays.asList(login1));
		
		User login2 = new User("cassiano", "$2y$12$RjGyK/e7j/A/19gUWlR8fOGF5cN6txEjas09Ft2zGeyf1b2jt8i96", true);
		userLoginRepository.saveAll(Arrays.asList(login2));
		
		User login3 = new User("andre", "$2y$12$RjGyK/e7j/A/19gUWlR8fOGF5cN6txEjas09Ft2zGeyf1b2jt8i96", true);
		userLoginRepository.saveAll(Arrays.asList(login3));
	
		DetailUser user1 = new DetailUser(null, "Agnaldo", "49999108458", "agnaldo@rosseti.ind.br", "Capinzal", "SC", "Brasil", login1);
		DetailUser user2 = new DetailUser(null, "Cassiano", "49999108458", "cassiano@rosseti.ind.br",  "Capinzal", "SC", "Brasil", login2);
		DetailUser user3 = new DetailUser(null, "André", "49999108458", "andre@rosseti.ind.br",  "Capinzal", "SC", "Brasil", login3);
		userRepository.saveAll(Arrays.asList(user1, user2, user3));
		
		
		
		
		Authoritie authoritie1 = new Authoritie("USER", login1);
		authoritieRepository.saveAll(Arrays.asList(authoritie1));
		
	
		
		
		
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
		
		
		
		
		
		
		//machineDetailRepository.saveAll(Arrays.asList(machineDetail1, machineDetail2, machineDetail3));
		
		
		UserMachine userMachine1 = new UserMachine(machine1, user1);
		UserMachine userMachine2 = new UserMachine(machine2, user1);
		UserMachine userMachine3 = new UserMachine(machine2, user2);
		UserMachine userMachine4 = new UserMachine(machine3, user3);
		
		userMachineRepository.saveAll(Arrays.asList(userMachine1, userMachine2, userMachine3, userMachine4));
		
		System.out.println("-----------------------------------");
		System.out.println("Profile Order 1: Test! Executed is sucess.");
		System.out.println("-----------------------------------");
	}
	
}
