package com.oracle;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.oracle.rest.MainAPI;
import com.oracle.rest.UserAPI;

@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(MainAPI.class);
		register(UserAPI.class);
	}

}