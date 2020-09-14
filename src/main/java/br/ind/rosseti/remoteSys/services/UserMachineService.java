package br.ind.rosseti.remoteSys.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ind.rosseti.remoteSys.entities.Machine;
import br.ind.rosseti.remoteSys.entities.UserMachine;
import br.ind.rosseti.remoteSys.repositories.MachineRepository;
import br.ind.rosseti.remoteSys.repositories.UserMachineRepository;


@Service
public class UserMachineService {
	
	@Autowired
	private UserMachineRepository repository;
	
	
	@Autowired
	private MachineRepository repositoryMachine;
	
	public List<UserMachine> findAll(){
		return repository.findAll();
	}
	

	//Consulta quais as Máquinas pertecentes ao ID de usuário fornecido
	public List<UserMachine> findById(Long id) {
		
		ArrayList<UserMachine> list = new ArrayList();
		
		for(UserMachine obj : repository.findAll())
		{
			if(obj.getUser().getId() == id) {
				list.add(obj);
			}
		}
		
		return list;
	}
	
}
