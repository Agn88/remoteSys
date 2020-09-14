package br.ind.rosseti.remoteSys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ind.rosseti.remoteSys.entities.Machine;

public interface MachineRepository extends JpaRepository<Machine, Long>{

}
