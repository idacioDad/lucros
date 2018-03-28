package mz.co.clabs.lucros.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mz.co.clabs.lucros.dao.ICompanyDAO;
import mz.co.clabs.lucros.dto.CompanyDTO;
import mz.co.clabs.lucros.dto.DTOUtils;
import mz.co.clabs.lucros.entity.generic.CompanyEntity;
import mz.co.clabs.lucros.exception.CompanyException;


/**
 * 
 * @author clabs programmer
 *
 */
@Component
@Path("/companyservice")
public class CompanyServiceImpl  implements IComopanyService
{
	
	@Autowired
	private ICompanyDAO companyDAO;

	@Path("/create")
	@PUT
	@Override
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String create(@FormParam("name") String name,
			@FormParam("email") String email,
			@FormParam("telephone") String telephone,
			@FormParam("address") String address,
			@FormParam("logo") byte [] logo,
			@FormParam("nuit") String nuit,
			@FormParam("tax") double  tax) throws CompanyException {	
		
		CompanyEntity company = 
				new  CompanyEntity(nuit,name,email,telephone,address,logo,tax);
		/*
		 * Verifica se  existe ja uma empresa registrada  na base de dados
		 * se sim,  o sistema lanca uma CompanyException caso contrario
		 * persiste a nova empresa  
		 *  
		 */
		if(companyDAO.findAll()==null){
			companyDAO.create(company);
		}else{
			throw new CompanyException();
			
		}
		
		
		return "Inserido com Sucesso";
	}
	
	@Override
	@Path("/update")
	@POST
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String update(@FormParam("name") String name,
			@FormParam("email") String email,
			@FormParam("telephone") String telephone,
			@FormParam("address") String address,
			@FormParam("logo") byte [] logo,
			@FormParam("nuit") String nuit,
			@FormParam("tax") double  tax) {
		
		CompanyEntity company = 
				new  CompanyEntity(nuit,name,email,telephone,address,logo,tax);
		
		companyDAO.update(company);
		
		return "Actualizado com Sucesso";
		
	}
	
	@Path("/delete")
	@POST
	@Override
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String delete(@FormParam("id") String id) {
		
		CompanyEntity company = companyDAO.findCompanybyId(Long.parseLong(id));
		companyDAO.delete(company);
		   
		return "Removido com Sucesso";
	}
	
	@Override
	@Path("/find")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public CompanyDTO findCompany() {
		
		CompanyEntity company =  companyDAO.findAll();
		
		return  DTOUtils.retrieveCompanyDTOByComapanyEntity(company);
		  
	}
}
