package mz.co.clabs.lucros.entity.stockmanagement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import mz.co.clabs.lucros.entity.generic.GenericEntity;


/**
 * 
 * @author Clerio Alfredo Faife
 * @since  13/03/2018
 *
 */
@Entity
@Table(name="WAREHOUSE")
public class WareHouseEntity extends GenericEntity {

	@Column(name="ADDRESS",nullable=false,unique=true)
	private String address;
	
	@Column(name="NAME", nullable=false)
	private String name;
	
	@Column(name="TELEFONE")
	private String telefone;
	
	@Column(name="EMAIL")
	private String email;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
