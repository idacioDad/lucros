package mz.co.clabs.lucros.dao;

import java.util.List;

public interface IGenericDAO <T>{
	
	public void create(T t);
	 
	public void update (T t);
	public void delete(T t);

}
