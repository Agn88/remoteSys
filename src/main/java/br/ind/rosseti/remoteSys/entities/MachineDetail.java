package br.ind.rosseti.remoteSys.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tb_machine_detail")
public class MachineDetail implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@ManyToOne
	@JoinColumn(name = "machine_id")
	private Machine machine;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant dateContents;
	
	String var01;
	String var02;
	String var03;
	String var04;
	String var05;
	String var06;
	String var07;
	String var08;
	String var09;
	String var10;
	String var11;
	String var12;
	String var13;
	
	
	public MachineDetail() {
		
	}


	public MachineDetail(Long id, Machine machine, Instant dateContents, String var01, String var02, String var03,
			String var04, String var05, String var06, String var07, String var08, String var09, String var10,
			String var11, String var12, String var13) {
		super();
		this.id = id;
		this.machine = machine;
		this.dateContents = dateContents;
		this.var01 = var01;
		this.var02 = var02;
		this.var03 = var03;
		this.var04 = var04;
		this.var05 = var05;
		this.var06 = var06;
		this.var07 = var07;
		this.var08 = var08;
		this.var09 = var09;
		this.var10 = var10;
		this.var11 = var11;
		this.var12 = var12;
		this.var13 = var13;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Machine getPicador() {
		return machine;
	}


	public void setPicador(Machine machine) {
		this.machine = machine;
	}


	public Instant getDateContents() {
		return dateContents;
	}


	public void setDateContents(Instant dateContents) {
		this.dateContents = dateContents;
	}


	public String getVar01() {
		return var01;
	}


	public void setVar01(String var01) {
		this.var01 = var01;
	}


	public String getVar02() {
		return var02;
	}


	public void setVar02(String var02) {
		this.var02 = var02;
	}


	public String getVar03() {
		return var03;
	}


	public void setVar03(String var03) {
		this.var03 = var03;
	}


	public String getVar04() {
		return var04;
	}


	public void setVar04(String var04) {
		this.var04 = var04;
	}


	public String getVar05() {
		return var05;
	}


	public void setVar05(String var05) {
		this.var05 = var05;
	}


	public String getVar06() {
		return var06;
	}


	public void setVar06(String var06) {
		this.var06 = var06;
	}


	public String getVar07() {
		return var07;
	}


	public void setVar07(String var07) {
		this.var07 = var07;
	}


	public String getVar08() {
		return var08;
	}


	public void setVar08(String var08) {
		this.var08 = var08;
	}


	public String getVar09() {
		return var09;
	}


	public void setVar09(String var09) {
		this.var09 = var09;
	}


	public String getVar10() {
		return var10;
	}


	public void setVar10(String var10) {
		this.var10 = var10;
	}


	public String getVar11() {
		return var11;
	}


	public void setVar11(String var11) {
		this.var11 = var11;
	}


	public String getVar12() {
		return var12;
	}


	public void setVar12(String var12) {
		this.var12 = var12;
	}


	public String getVar13() {
		return var13;
	}


	public void setVar13(String var13) {
		this.var13 = var13;
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
		MachineDetail other = (MachineDetail) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
		
	
	
	
}
