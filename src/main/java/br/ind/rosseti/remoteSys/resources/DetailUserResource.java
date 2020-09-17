package br.ind.rosseti.remoteSys.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ind.rosseti.remoteSys.entities.DetailUser;
import br.ind.rosseti.remoteSys.services.DetailUserService;


@RestController
@RequestMapping(value = "/users")
public class DetailUserResource {
	
	@Autowired
	private DetailUserService service;
	
	@GetMapping
	public ResponseEntity<List<DetailUser>> findAll(){
		List<DetailUser> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<DetailUser> bindById(@PathVariable Long id){
		DetailUser obj = service.findById(id);
		return ResponseEntity.ok(obj);
	}
	
}