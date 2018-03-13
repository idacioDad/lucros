package mz.co.clabs.lucros.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import mz.co.clabs.lucros.entity.generic.GenericEntity;
import mz.co.clabs.lucros.util.EEntityState;



@Repository
public class GenericDAOImpl<T extends GenericEntity> implements IGenericDAO<T> {
	
	@PersistenceContext
	private EntityManager em;

	public void create(T t) {
		em.persist(t);
		
	}

	

	public void update(T t) {
		em.merge(t);
		
	}

	public void delete(T t) {
		t.setState(EEntityState.INACTIVE.getState());
		em.merge(t);
		
	}

}
