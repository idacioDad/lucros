package mz.co.clabs.lucros.dto;

import mz.co.clabs.lucros.entity.generic.CompanyEntity;

/**
 * 
 * @author clabs programmer
 *
 */

public class DTOUtils {
	
	public static  CompanyDTO  retrieveCompanyDTOByComapanyEntity(CompanyEntity company  ){
		
		CompanyDTO companyDTO = new CompanyDTO();
		companyDTO.setAddress(company.getAddress());
		companyDTO.setEmail(company.getEmail());
		companyDTO.setLogo(company.getLogo());
		companyDTO.setName(company.getName());
		companyDTO.setNuit(company.getNuit());
		companyDTO.setTax(company.getTax());
		companyDTO.setTelephone(company.getTelephone());
 		
		return companyDTO;
	}
	
	public static CompanyEntity  retrieveComapanyEntityByCompanyDTO(CompanyDTO companyDTO  ){
		
	  CompanyEntity company = new CompanyEntity();
	  company.setAddress(companyDTO.getAddress());
	  company.setEmail(companyDTO.getEmail());
	  company.setLogo(companyDTO.getLogo());
	  company.setName(companyDTO.getName());
	  company.setNuit(companyDTO.getNuit());
	  company.setTax(companyDTO.getTax());
	  company.setTelephone(companyDTO.getTelephone());
 		
		return company;
	}

}
