package com.oracle.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

//@Path("/hello")
@Component
public class MainController {

	@GET
	@Path("getMethod")
	public String getMethod(){
		return " this is a get method";
	}
	
	@POST
	@Path("/postMethod")
	public String test(){
		return "this is a post method";
	}
}
