package mz.co.clabs.lucros.entity.generic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import mz.co.clabs.lucros.dao.ICompanyDAO;

/**
 * 
 * @author clabs programmer
 */

@Entity
@Table(name="COMPANY",  schema="LUCROS_USER")
@NamedQueries({
	@NamedQuery(name=ICompanyDAO.QUERY_NAME.findAll,query=ICompanyDAO.QUERY.findAll),
	@NamedQuery(name=ICompanyDAO.QUERY_NAME.findCompanybyId,query=ICompanyDAO.QUERY.findCompanybyId)
})
public class CompanyEntity extends GenericEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="NUIT",nullable=false,unique=true)
	private String nuit;
	
	@Column(name="NAME", nullable=false,unique=true)
	private String name;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="TELEPHONE")
	private String telephone;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="LOGO")
	private byte [] logo;
	
	@Column(name="TAX")
	private double tax;
	
	public CompanyEntity(){}
	
	public CompanyEntity(String nuit,
			String name,
			String email,
			String telephone,
			String address,
			byte [] logo,
			double tax){
		this.name=name;
		this.email=email;
		this.telephone=telephone;
		this.address=address;
		this.logo=logo;
		this.nuit=nuit;
		this.tax=tax;
	}

	public String getNuit() {
		return nuit;
	}

	public void setNuit(String nuit) {
		this.nuit = nuit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
}
