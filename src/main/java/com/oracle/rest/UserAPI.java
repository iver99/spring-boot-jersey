package com.oracle.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.oracle.dao.UserDao;
import com.oracle.entity.User;
@Path("/")
@Component
public class UserAPI {
	
	Logger logger=Logger.getLogger(UserAPI.class);

	@Autowired
	UserDao userDao;
	
	//@RequestMapping("/get-by-email")
	@GET
	@Path("/user/{id}")
    public String getByEmail(@PathVariable int id) {
	  logger.info("user id is "+id);
	  Long uId=Long.valueOf(id);
      String userId;
      User user = userDao.findById(uId);
      if (user != null) {
        userId = String.valueOf(user.getId());
        return "The user id is: " + userId+" and user name is "+user.getUsername();
      }
      return "user " + id + " is not exist.";
    }
}
