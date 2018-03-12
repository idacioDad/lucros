package mz.co.clabs.lucros.entity.stockmanagement;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import mz.co.clabs.lucros.entity.generic.GenericEntity;
@Entity
@Table(name="DATE_ITEM")
public class DateItemEntity extends GenericEntity{
	
	@Column(name="ENTRACE_DATE", nullable=false)
	private Calendar entranceDate;
	
	@Column(name="DEVOLUTION_DATE")
	private Calendar devolutionDate;
	
	@Column(name="SALES_DATE")
	private Calendar saleDate;
	
	@Column(name="EXPIRACTION_DATE")
	private Calendar expirationDate;
	
	@Column(name="MANUFACTURE_DATE")
	private Calendar manufactureDate;

	public Calendar getEntranceDate() {
		return entranceDate;
	}

	public void setEntranceDate(Calendar entranceDate) {
		this.entranceDate = entranceDate;
	}

	public Calendar getDevolutionDate() {
		return devolutionDate;
	}

	public void setDevolutionDate(Calendar devolutionDate) {
		this.devolutionDate = devolutionDate;
	}

	public Calendar getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Calendar saleDate) {
		this.saleDate = saleDate;
	}

	public Calendar getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Calendar expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Calendar getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Calendar manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
}
