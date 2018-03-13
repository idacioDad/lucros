package mz.co.clabs.lucros.entity.stockmanagement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * 
 * @author Clerio Alfredo Faife
 *
 */

import mz.co.clabs.lucros.entity.generic.GenericEntity;
import mz.co.clabs.lucros.entity.user.AdministratorEntity;
/**
 * 
 * @author Clerio Alfredo Faife
 * @since  13/03/2018
 *
 */

@Entity
@Table(name="PRODUCT")
public class ProductEntity extends GenericEntity {

	@Column(name="CODE",nullable=false,unique=true)
	private String code;
	
	@Column(name="NAME", nullable=false)
	private String name;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="BRAND")
	private String brand;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ADMINISTRATOR_ID")
	private AdministratorEntity administrator;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CATEGORY_ID")
	private CategoryEntity category;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public AdministratorEntity getAdministrator() {
		return administrator;
	}

	public void setAdministrator(AdministratorEntity administrator) {
		this.administrator = administrator;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
}
