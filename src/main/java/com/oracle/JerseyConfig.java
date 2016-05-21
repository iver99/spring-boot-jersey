package com.oracle;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.oracle.controller.MainController;

@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(MainController.class);
	}

}