package com.javatechie.consul.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAutomation {
	

	static Logger logger = LoggerFactory.getLogger(SpringAutomation.class);

	@GetMapping("/hello")

	public String getHello(){
		return "Hello Spring world";
	}


	@PostConstruct
	public void init()
	{
		logger.info("application started");
	}
	
	public static void main(String[] args) {
		
		
		
		logger.info("application executed...");

		logger.info("new  logger added");
		
		SpringApplication.run(SpringAutomation.class, args);
	}

}
