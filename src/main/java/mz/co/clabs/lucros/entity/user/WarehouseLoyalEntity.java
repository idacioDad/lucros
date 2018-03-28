package mz.co.clabs.lucros.entity.user;

import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * 
 * @author clabs programmer
 *
 */
@Entity
@Table(name="warehouse_loyal")
public class WarehouseLoyalEntity  extends UserEntity implements  IWarehouseLoyal{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
