package mz.co.clabs.lucros.dao;
/**
 * 
 * @author Clerio Alfredo Faife
 * @since  13/03/2018
 *
 */

public interface IGenericDAO <T>{
	
	public void create(T t);
	 
	public void update (T t);
	public void delete(T t);

}
