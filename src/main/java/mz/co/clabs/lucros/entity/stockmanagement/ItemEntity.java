package mz.co.clabs.lucros.entity.stockmanagement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import mz.co.clabs.lucros.entity.generic.GenericEntity;
import mz.co.clabs.lucros.entity.user.WarehouseLoyalEntity;

@Entity
@Table(name="ITEM")
public class ItemEntity extends GenericEntity {

	@Column(name="CODE",nullable=false,unique=true)
	private String code;
	
	@Column(name="QTY")
	private int quantity;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="WAREHOUSE_LOYAL_ID")
	private WarehouseLoyalEntity warehouseLoyal;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="SUPPLIER_ID")
	private SupplierEntity supplier;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PRODUCT_ID")
	private ProductEntity product;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PRICE_ID")
	private PriceEntity price;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="DATE_ITEM_ID")
	private DateItemEntity dateItem;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="WAREHOUSE_ID")
	private WareHouseEntity wareHouse;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public WarehouseLoyalEntity getWarehouseLoyal() {
		return warehouseLoyal;
	}

	public void setWarehouseLoyal(WarehouseLoyalEntity warehouseLoyal) {
		this.warehouseLoyal = warehouseLoyal;
	}

	public SupplierEntity getSupplier() {
		return supplier;
	}

	public void setSupplier(SupplierEntity supplier) {
		this.supplier = supplier;
	}

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}

	public PriceEntity getPrice() {
		return price;
	}

	public void setPrice(PriceEntity price) {
		this.price = price;
	}

	public DateItemEntity getDateItem() {
		return dateItem;
	}

	public void setDateItem(DateItemEntity dateItem) {
		this.dateItem = dateItem;
	}

	public WareHouseEntity getWareHouse() {
		return wareHouse;
	}

	public void setWareHouse(WareHouseEntity wareHouse) {
		this.wareHouse = wareHouse;
	}
}
