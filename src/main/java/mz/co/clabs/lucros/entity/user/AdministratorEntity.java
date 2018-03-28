package mz.co.clabs.lucros.entity.user;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 * @author clabs programmer
 *
 *
 */
@Entity
@Table(name="ADMINISTRATOR" , schema="LUCROS_USER")
public class AdministratorEntity extends UserEntity implements IWarehouseLoyal , ISalesAgent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
