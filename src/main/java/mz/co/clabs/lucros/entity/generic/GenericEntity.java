package mz.co.clabs.lucros.entity.generic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import mz.co.clabs.lucros.util.EEntityState;
@Entity
public class GenericEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private long id;
	
	@Column
	private int state = EEntityState.ACTIVE.getState();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	} 
	
}
