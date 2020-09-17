package br.ind.rosseti.remoteSys.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "authorities")
public class Authoritie implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private String authority;
	
	@ManyToOne
    @JoinColumn(name = "username")
	private User username;
	
	public Authoritie() {
		
	}
	
	

	public Authoritie(String authority, User username) {
		super();
		this.authority = authority;
		this.username = username;
	}



	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public User getUsername() {
		return username;
	}

	public void setUsername(User username) {
		this.username = username;
	}

		
	
	
	
}
