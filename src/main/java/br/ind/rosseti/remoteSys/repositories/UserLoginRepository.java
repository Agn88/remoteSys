package br.ind.rosseti.remoteSys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ind.rosseti.remoteSys.entities.User;

public interface UserLoginRepository extends JpaRepository<User, Long>{

}
