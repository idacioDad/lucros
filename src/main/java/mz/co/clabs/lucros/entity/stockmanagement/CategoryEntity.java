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
@Table(name="CATEGORY")
public class CategoryEntity extends GenericEntity {

	@Column(name="NAME", nullable=false,unique=true)
	private String  name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
