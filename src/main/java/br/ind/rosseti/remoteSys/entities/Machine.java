package br.ind.rosseti.remoteSys.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tb_machine")
public class Machine implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String name;
	String ip;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant lastConnection;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant nextConnection;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant lastError;
	String codeError;
	String codeMachine;
	
	
	public Machine() {
		
	}


	public Machine(Long id, String name, String ip, Instant lastConnection, Instant nextConnection,
			Instant lastError, String codeError, String codeMachine) {
		super();
		this.id = id;
		this.name = name;
		this.ip = ip;
		this.lastConnection = lastConnection;
		this.nextConnection = nextConnection;
		this.lastError = lastError;
		this.codeError = codeError;
		this.codeMachine = codeMachine;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getIp() {
		return ip;
	}


	public void setIp(String ip) {
		this.ip = ip;
	}


	public Instant getLastConnection() {
		return lastConnection;
	}


	public void setLastConnection(Instant lastConnection) {
		this.lastConnection = lastConnection;
	}


	public Instant getNextConnection() {
		return nextConnection;
	}


	public void setNextConnection(Instant nextConnection) {
		this.nextConnection = nextConnection;
	}


	public Instant getLastError() {
		return lastError;
	}


	public void setLastError(Instant lastError) {
		this.lastError = lastError;
	}


	public String getCodeError() {
		return codeError;
	}


	public void setCodeError(String codeError) {
		this.codeError = codeError;
	}
	
	public String getCodeMachine() {
		return codeMachine;
	}

	public void setCodeMachine(String codeMachine) {
		this.codeMachine = codeMachine;
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
		Machine other = (Machine) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
