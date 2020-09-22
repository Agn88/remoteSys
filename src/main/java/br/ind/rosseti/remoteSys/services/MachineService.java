package br.ind.rosseti.remoteSys.services;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.ind.rosseti.remoteSys.entities.Machine;
import br.ind.rosseti.remoteSys.repositories.MachineRepository;
import br.ind.rosseti.remoteSys.services.exceptions.DataIntegrityException;
import br.ind.rosseti.remoteSys.services.exceptions.ObjectNotFoundException;


@Service
public class MachineService {
	
	@Autowired
	private MachineRepository repository;
	
	public List<Machine> findAll(){
		return repository.findAll();
	}
	
	public Machine findById(Long id) {
		Optional<Machine> obj = repository.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException("Object not found! Id: " + id + ", Name: " + Machine.class.getName()));
	}
	
	public Machine insert(Machine obj)
	{
		obj.setId(null);
		return repository.save(obj);
	}
	
	public Machine update(Machine obj)
	{
		Machine newObj = findById(obj.getId());
		updateData(newObj, obj);
		return repository.save(obj);
	}
	
	private void updateData(Machine newObj, Machine obj)
	{
		newObj.setIp(obj.getIp());
		newObj.setName(obj.getName());
	}
	
	public Machine fromDTO(Machine objDto)
	{
		return new Machine(objDto.getId(), objDto.getName(), objDto.getIp(), Instant.parse("2019-06-20T19:53:07Z"), Instant.parse("2019-06-20T19:53:07Z"), Instant.parse("2019-06-20T19:53:07Z"), objDto.getCodeError(), objDto.getCodeMachine() );
	}
	
	public void delete(Long id)
	{
		findById(id);
		try {
			repository.deleteById(id);
		}
		catch(DataIntegrityViolationException e) {
			throw new DataIntegrityException("Not possible delete to Machine!");
		}
		
	}
}
