package mz.co.clabs.lucros.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import mz.co.clabs.lucros.entity.generic.CompanyEntity;


@Repository
public class CompanyDAOImpl implements ICompanyDAO{
	
	@PersistenceContext
	private EntityManager em;

	public void create(CompanyEntity t) {
 		
	}

	public List<CompanyEntity> read() {
		return null;
	}

	public void update(CompanyEntity t) {
		
	}

	public void delete(CompanyEntity t) {
		
	}

	public List<CompanyEntity> findAll() {
		 
		Query q= em.createNamedQuery(ICompanyDAO.QUERY_NAME.findAll);
		return ( List<CompanyEntity> ) q.getResultList();
	}

}
