package br.ind.rosseti.remoteSys.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ind.rosseti.remoteSys.entities.MachineDetail;
import br.ind.rosseti.remoteSys.services.MachineDetailService;


@RestController
@RequestMapping(value = "/machineDetails")
public class MachineDetailResource {
	
	@Autowired
	private MachineDetailService service;
	
	@GetMapping
	public ResponseEntity<List<MachineDetail>> findAll(){
		List<MachineDetail> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<MachineDetail> bindById(@PathVariable Long id){
		MachineDetail obj = service.findById(id);
		return ResponseEntity.ok(obj);
	}
	
}