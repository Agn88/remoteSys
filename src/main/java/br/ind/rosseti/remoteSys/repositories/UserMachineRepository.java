package br.ind.rosseti.remoteSys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ind.rosseti.remoteSys.entities.UserMachine;



public interface UserMachineRepository extends JpaRepository<UserMachine, Long>{

}
