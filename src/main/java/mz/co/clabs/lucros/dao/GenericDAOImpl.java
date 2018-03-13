package mz.co.clabs.lucros.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import mz.co.clabs.lucros.entity.generic.GenericEntity;
import mz.co.clabs.lucros.util.EEntityState;

/**
 * @author Clerio Alfredo Faife
 * @since  13/03/2018
 */
@Repository
public class GenericDAOImpl<T extends GenericEntity> implements IGenericDAO<T> {
	
	@PersistenceContext
	private EntityManager em;

	public void create(T t) {
		this.em.persist(t);
	}

	public void update(T t) {
		this.em.merge(t);
	}

	public void delete(T t) {
		t.setState(EEntityState.INACTIVE.getState());
		this.em.merge(t);
	}

}
