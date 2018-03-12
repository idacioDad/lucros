package mz.co.clabs.lucros.dao;

import java.util.List;

import mz.co.clabs.lucros.entity.generic.CompanyEntity;

public interface ICompanyDAO  {

	public  class QUERY{
		public final static String findAll="SELECT c from CompanyEntity c";
	}
	
	public  class QUERY_NAME{
		public final static String findAll="CompanyEntity.findAll";
	}
	
	public   List<CompanyEntity>  findAll();
	
}
