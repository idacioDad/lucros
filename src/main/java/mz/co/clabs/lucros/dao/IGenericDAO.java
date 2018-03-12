package mz.co.clabs.lucros.dao;

import mz.co.clabs.lucros.entity.generic.GenericEntity;

public interface IGenericDAO <T>{
	
	public void create(T t);
	public void update(T t);
	public void delete(T t);

}
