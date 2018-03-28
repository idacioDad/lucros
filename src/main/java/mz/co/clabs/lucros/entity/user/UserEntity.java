package mz.co.clabs.lucros.entity.user;

import javax.persistence.Entity;

import mz.co.clabs.lucros.entity.generic.GenericEntity;
/**
 * 
 * @author clabs programmer
 
 *
 */
@Entity

public abstract class UserEntity  extends GenericEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String username;
	
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
