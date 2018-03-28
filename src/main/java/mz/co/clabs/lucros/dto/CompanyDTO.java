package mz.co.clabs.lucros.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

 
/**
 * @author  clabs programmer 
 */

@XmlRootElement(name="company")
public class CompanyDTO {
	
	private String nuit;
	
	private String name;
	
	private String email;
	
	private String telephone;
	
	private String address;
	
	private byte [] logo;
	
	private double tax;

	public String getNuit() {
		return nuit;
	}
	@XmlElement(name="nuit")
	public void setNuit(String nuit) {
		this.nuit = nuit;
	}

	public String getName() {
		return name;
	}
	@XmlElement(name="name")
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	@XmlElement(name="email")
	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}
	@XmlElement(name="telephone")
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}
	@XmlElement(name="address")
	public void setAddress(String address) {
		this.address = address;
	}

	public byte[] getLogo() {
		return logo;
	}
	@XmlElement(name="logo")
	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	public double getTax() {
		return tax;
	}
	@XmlElement(name="tax")
	public void setTax(double tax) {
		this.tax = tax;
	} 
	
	
	
}
