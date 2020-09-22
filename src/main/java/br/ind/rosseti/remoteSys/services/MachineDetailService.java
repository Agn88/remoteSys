package br.ind.rosseti.remoteSys.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ind.rosseti.remoteSys.entities.Machine;
import br.ind.rosseti.remoteSys.entities.MachineDetail;
import br.ind.rosseti.remoteSys.repositories.MachineDetailRepository;


@Service
public class MachineDetailService {
	
	@Autowired
	private MachineDetailRepository repository;
	
	public List<MachineDetail> findAll(){
		return repository.findAll();
	}
	
	
	
	public List<MachineDetail> findListAllById(Long id){
	
		Machine machine = new Machine();
		
		
		for(MachineDetail obj : repository.findAll() )
		{
			
		}
		
		return repository.findAll();
	}
	

	public MachineDetail findById(Long id) {
		Optional<MachineDetail> obj = repository.(id);
		return obj.get();
	}
	
}
