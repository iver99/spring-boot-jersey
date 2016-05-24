package com.oracle.rest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import com.oracle.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration 
public class MainAPITest {
	
	RestTemplate restTemplate=new RestTemplate();

	@Test
	public void testGetMethod(){
		ResponseEntity<String> re=restTemplate.getForEntity("http://123.56.143.59:8585/DaTian/sendVcodeToPhoneAjax?phone=18401608330", String.class);
		String returnValue=re.getBody();
		//Assert.assertEquals(returnValue, "test...");
	}
}
