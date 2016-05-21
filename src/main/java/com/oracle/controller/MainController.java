package com.oracle.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

@Path("/hello")
@Component
public class MainController {

	@GET
	public String hello(){
		return "get";
	}
	
	@POST
	@Path("/test")
	public String test(){
		return "post";
	}
}
