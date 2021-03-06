package com.oracle.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Path("/")
@Component
public class MainAPI {

	
	@GET
	@Path("/test")
	public String test(){
		return "tesing...";
	}
	
	@GET
	@Path("/getMethod")
	public String getMethod(){
		return " this is a get method";
	}
	
	@POST
	@Path("/postMethod")
	public String postMethod(){
		return "this is a post method";
	}
}
