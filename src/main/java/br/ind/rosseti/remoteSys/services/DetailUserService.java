package br.ind.rosseti.remoteSys.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ind.rosseti.remoteSys.entities.DetailUser;
import br.ind.rosseti.remoteSys.repositories.DetailUserRepository;


@Service
public class DetailUserService {
	
	@Autowired
	private DetailUserRepository repository;
	
	public List<DetailUser> findAll(){
		return repository.findAll();
	}
	

	public DetailUser findById(Long id) {
		Optional<DetailUser> obj = repository.findById(id);
		return obj.get();
	}
	
}
