package br.ind.rosseti.remoteSys.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ind.rosseti.remoteSys.entities.Machine;
import br.ind.rosseti.remoteSys.entities.DetailUser;
import br.ind.rosseti.remoteSys.entities.UserMachine;
import br.ind.rosseti.remoteSys.services.UserMachineService;
import br.ind.rosseti.remoteSys.services.DetailUserService;


@RestController
@RequestMapping(value = "/userMachines")
public class UserMachineResource {
	
	@Autowired
	private UserMachineService service;
	
	@Autowired
	private DetailUserService serviceUser;
	
	@GetMapping
	public ResponseEntity<List<UserMachine>> findAll(){
		List<UserMachine> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	

	
	@GetMapping(value = "/{id}")
	public ResponseEntity<List<UserMachine>> bindById(@PathVariable Long id){
		List<UserMachine> list = service.findById(id);
		return ResponseEntity.ok().body(list);
	}
	
}