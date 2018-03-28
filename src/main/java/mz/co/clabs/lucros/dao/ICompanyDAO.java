package mz.co.clabs.lucros.dao;

 


import mz.co.clabs.lucros.entity.generic.CompanyEntity;
 
/**
 * 
 * @author clabs programmer
  *
 */

public interface ICompanyDAO extends  IGenericDAO<CompanyEntity> {

	public  class QUERY{
		public static final String findAll=" SELECT c FROM  CompanyEntity c WHERE state = :state ";
		public static final String findCompanybyId=" SELECT c FROM   CompanyEntity c WHERE id = :id "; 
	}
	
	public  class QUERY_NAME{
		public static final String findAll="CompanyEntity.findAll";
		public static final String findCompanybyId="CompanyEntity.findCompanybyId"; 
	}
	
	public   CompanyEntity  findAll();
	
	public CompanyEntity findCompanybyId(Long id);
	
	
	
}
