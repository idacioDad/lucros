package mz.co.clabs.lucros.entity.stockmanagement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import mz.co.clabs.lucros.entity.generic.GenericEntity;

@Entity
@Table(name="PRICE")
public class PriceEntity extends GenericEntity{
	
	@Column(name="PURCHASE_PRICE")
	private double purchasePrice;
	
	@Column(name="PURCHASE_PRICE", nullable=false)
	private double salePrice;

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	
	
}
