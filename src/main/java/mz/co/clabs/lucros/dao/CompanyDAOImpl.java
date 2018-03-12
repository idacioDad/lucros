package mz.co.clabs.lucros.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import mz.co.clabs.lucros.entity.generic.CompanyEntity;


@Repository
public class CompanyDAOImpl extends GenericDAOImpl<CompanyEntity> implements ICompanyDAO{
	
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	public List<CompanyEntity> findAll() {
		 
		Query q= em.createNamedQuery(ICompanyDAO.QUERY_NAME.findAll,CompanyEntity.class);
		return ( List<CompanyEntity> ) q.getResultList();
	}

}
