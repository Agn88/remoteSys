package br.ind.rosseti.remoteSys.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ind.rosseti.remoteSys.entities.Machine;
import br.ind.rosseti.remoteSys.repositories.MachineRepository;


@Service
public class MachineService {
	
	@Autowired
	private MachineRepository repository;
	
	public List<Machine> findAll(){
		return repository.findAll();
	}
	

	public Machine findById(Long id) {
		Optional<Machine> obj = repository.findById(id);
		return obj.get();
	}
	
}
