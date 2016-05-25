package com.oracle.rest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.oracle.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration 
public class MainAPITest {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	/**
	 * 		RestTemplate restTemplate = new RestTemplate();
	        HttpHeaders headers = new HttpHeaders();
	        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
	        headers.setContentType(type);
	        headers.add("Accept", MediaType.APPLICATION_JSON.toString());
	        
	        JSONObject jsonObj = JSONObject.fromObject(params);
	        
	        HttpEntity<String> formEntity = new HttpEntity<String>(jsonObj.toString(), headers);
	
	        String result = restTemplate.postForObject(url, formEntity, String.class);
	 */

	@Test
	public void testGetMethod(){
		
	}
}
