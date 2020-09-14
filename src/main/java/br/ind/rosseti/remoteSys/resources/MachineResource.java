package br.ind.rosseti.remoteSys.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ind.rosseti.remoteSys.entities.Machine;
import br.ind.rosseti.remoteSys.services.MachineService;


@RestController
@RequestMapping(value = "/machines")
public class MachineResource {
	
	@Autowired
	private MachineService service;
	
	@GetMapping
	public ResponseEntity<List<Machine>> findAll(){
		List<Machine> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Machine> bindById(@PathVariable Long id){
		Machine obj = service.findById(id);
		return ResponseEntity.ok(obj);
	}
	
}