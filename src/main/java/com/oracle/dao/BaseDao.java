package com.oracle.dao;

import java.io.Serializable;

public interface BaseDao<T> {
	
	/**
	 * save object
	 * @param o
	 */
	public Serializable save(T o);
	
	public T get(Class<T> c, Serializable id);

}
