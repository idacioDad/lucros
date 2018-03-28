package mz.co.clabs.lucros.service;

 
 import mz.co.clabs.lucros.dto.CompanyDTO;
 import mz.co.clabs.lucros.exception.CompanyException;

/**
 * 
 * @author clabs programmer
 *
 */


public interface IComopanyService  {
	
	
	public String  create( String name,
			 String email,
			 String telephone,
			 String address,
			 byte [] logo,
			 String nuit,
			 double  tax) throws CompanyException;
	
	public String  update(String name,
			 String email,
			 String telephone,
			 String address,
			 byte [] logo,
			 String nuit,
			 double  tax);
	 
	public String  delete(String id);
	
	public CompanyDTO findCompany();
	
 
	

}
