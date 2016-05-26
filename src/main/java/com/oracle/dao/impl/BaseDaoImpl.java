package com.oracle.dao.impl;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.dao.BaseDao;
@Repository
@Transactional
@SuppressWarnings("unchecked")
public class BaseDaoImpl<T> implements BaseDao<T>{

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public Serializable save(T o) {
		if(o==null)
			return null;
		else
			return getCurrentSession().save(o);
	}

	@Override
	public T get(Class<T> c, Serializable id) {
			return (T) this.getCurrentSession().get(c, id);
	}
	
	

}
