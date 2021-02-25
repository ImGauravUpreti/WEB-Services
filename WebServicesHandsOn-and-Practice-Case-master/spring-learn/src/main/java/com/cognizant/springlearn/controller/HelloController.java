package com.cognizant.springlearn.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.SpringLearnApplication;

@RestController
public class HelloController
{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	@GetMapping("/hello")
	public String sayHello()
	{
		LOGGER.info("START");
		LOGGER.debug("HELLO ");
		LOGGER.info("END");

		return "Hello  World!!"; 
	}

}
