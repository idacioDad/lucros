package mz.co.clabs.lucros.dao;

 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import mz.co.clabs.lucros.entity.generic.CompanyEntity;
import mz.co.clabs.lucros.util.EEntityState;
/**
 * 
 * @author clabs programmer
 *
 */

@Repository
public class CompanyDAOImpl extends GenericDAOImpl<CompanyEntity> implements ICompanyDAO{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public CompanyEntity findAll() {
		 
		Query q= em.createNamedQuery(ICompanyDAO.QUERY_NAME.findAll,CompanyEntity.class);
		q.setParameter("state", EEntityState.ACTIVE.getState());
		return (CompanyEntity ) q.getResultList();
	}

	@Override
	public CompanyEntity findCompanybyId(Long id) {
		Query q =em.createNamedQuery(ICompanyDAO.QUERY_NAME.findCompanybyId,CompanyEntity.class);
		q.setParameter("id", id);
		return (CompanyEntity)q.getSingleResult();
	}

}
