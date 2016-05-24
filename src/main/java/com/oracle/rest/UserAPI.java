package com.oracle.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.oracle.dao.UserDao;
import com.oracle.entity.User;
@Path("/user")
@Component
public class UserAPI {
	
	Logger logger=Logger.getLogger(UserAPI.class);

	@Autowired
	UserDao userDao;
	/**
	 * this method is for testing
	 * @param id
	 * @return
	 */
	@GET
	@Path("/string/{id}")
    public String getUserString(@PathParam(value="id") String id) {
	  logger.info("user id is "+id);
	  Long uId=Long.valueOf(id);
      User user = userDao.findById(uId);
      if (user != null) {
    	  String userId = String.valueOf(user.getId());
        return "The user id is: " + userId+" and user name is "+user.getUsername();
      }
      return "user " + id + " is not exist.";
    }
	
	/**
	 * get user by id
	 */
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON) 
	public User getUser(@PathParam(value="id") String id){
		logger.info("user id is "+id);
		Long uId=Long.valueOf(id);
	    User user = userDao.findById(uId);
	    return user;
	}
}
