package com.oracle;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.oracle.rest.MainController;
import com.oracle.rest.UserController;

@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(MainController.class);
		register(UserController.class);
	}

}