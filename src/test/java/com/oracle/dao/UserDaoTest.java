package com.oracle.dao;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.oracle.Application;
import com.oracle.entity.User;
import com.oracle.rest.UserAPI;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration 
public class UserDaoTest {
	Logger logger=Logger.getLogger(UserAPI.class);
	@Autowired
	UserDao userDao;

	@Test
	public void testUser(){
//		 User user = userDao.findById(1L);
		User user=userDao.findOne(1L);
		 Assert.assertNotNull(user);
	}
}
