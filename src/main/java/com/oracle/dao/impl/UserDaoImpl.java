package com.oracle.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.dao.UserDao;
import com.oracle.entity.User;
@Repository
@Transactional
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{


	
}
