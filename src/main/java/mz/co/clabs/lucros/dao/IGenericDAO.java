package mz.co.clabs.lucros.dao;


public interface IGenericDAO <T>{
	
	public void create(T t);
	 
	public void update (T t);
	public void delete(T t);

}
