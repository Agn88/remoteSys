package br.ind.rosseti.remoteSys.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.ind.rosseti.remoteSys.entities.pk.UserMachinePK;

@Entity
@Table(name = "user_machine")
public class UserMachine implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private UserMachinePK id= new UserMachinePK();
	
	public UserMachine() {}

	public UserMachine(Machine machine, DetailUser user) {
		super();
		id.setMachine(machine);
		id.setUser(user);
	}
	 
	
	public Machine getMachine() {
		return id.getMachine();
	}
	
	public void setMachine(Machine machine) {
		id.setMachine(machine);
	}
	
	
	public DetailUser getUser() {
		return id.getUser();
	}
	
	public void setUser(DetailUser user) {
		id.setUser(user);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserMachine other = (UserMachine) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
}
