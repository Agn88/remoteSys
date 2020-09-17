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
@Table(name = "machine_detail")
public class MachineDetail implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "machine_id")
	private Machine machine;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant dateContents;
	
	private Float var01;
	private Float var02;
	private Float var03;
	private Float var04;
	private Float var05;
	private Float var06;
	private Float var07;
	private Float var08;
	private Float var09;
	private Float var10;
	private Float var11;
	private Float var12;
	private Float var13;
	
	
	public MachineDetail() {
		
	}

	public MachineDetail(Long id, Machine machine, Instant dateContents, Float var01, Float var02, Float var03,
			Float var04, Float var05, Float var06, Float var07, Float var08, Float var09, Float var10, Float var11,
			Float var12, Float var13) {
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

	public Machine getMachine() {
		return machine;
	}

	public void setMachine(Machine machine) {
		this.machine = machine;
	}

	public Instant getDateContents() {
		return dateContents;
	}

	public void setDateContents(Instant dateContents) {
		this.dateContents = dateContents;
	}

	public Float getVar01() {
		return var01;
	}

	public void setVar01(Float var01) {
		this.var01 = var01;
	}

	public Float getVar02() {
		return var02;
	}

	public void setVar02(Float var02) {
		this.var02 = var02;
	}

	public Float getVar03() {
		return var03;
	}

	public void setVar03(Float var03) {
		this.var03 = var03;
	}

	public Float getVar04() {
		return var04;
	}

	public void setVar04(Float var04) {
		this.var04 = var04;
	}

	public Float getVar05() {
		return var05;
	}

	public void setVar05(Float var05) {
		this.var05 = var05;
	}

	public Float getVar06() {
		return var06;
	}

	public void setVar06(Float var06) {
		this.var06 = var06;
	}

	public Float getVar07() {
		return var07;
	}

	public void setVar07(Float var07) {
		this.var07 = var07;
	}

	public Float getVar08() {
		return var08;
	}

	public void setVar08(Float var08) {
		this.var08 = var08;
	}

	public Float getVar09() {
		return var09;
	}

	public void setVar09(Float var09) {
		this.var09 = var09;
	}

	public Float getVar10() {
		return var10;
	}

	public void setVar10(Float var10) {
		this.var10 = var10;
	}

	public Float getVar11() {
		return var11;
	}

	public void setVar11(Float var11) {
		this.var11 = var11;
	}

	public Float getVar12() {
		return var12;
	}

	public void setVar12(Float var12) {
		this.var12 = var12;
	}

	public Float getVar13() {
		return var13;
	}

	public void setVar13(Float var13) {
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
