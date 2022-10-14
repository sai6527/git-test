package com.hello.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloClientController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/hello")
	public String getHello() {
	  
		String url = "http://localhost:9091/gethello";
		
	    String response = restTemplate.getForObject(url, String.class);
	    return response;
		
	}
	
	
}
