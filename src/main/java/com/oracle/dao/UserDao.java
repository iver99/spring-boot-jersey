package com.oracle.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.entity.User;
@Transactional
public interface UserDao extends CrudRepository<User, Long>{
	
	 public User findById(Long id);

}
