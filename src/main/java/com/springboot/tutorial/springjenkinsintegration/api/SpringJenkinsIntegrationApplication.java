package com.springboot.tutorial.springjenkinsintegration.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsIntegrationApplication {

	/*SpringJenkinsIntegrationApplication() {
		System.out.println("Application constructor called.");
		logger.info("Application started...");
	}*/

	/*@Autowired
	private TestService service;*/
	public static Logger logger =
			LoggerFactory.getLogger(SpringJenkinsIntegrationApplication.class);

	/*@PostConstruct
	public void init() {
		service.testClass();
		logger.info("Application started...");
	}*/

	@PostConstruct
	public void init() {
		logger.info("Application started...");
		logger.info("Test commit");
	}

	public static void main(String[] args) {
		logger.info("Application executed...");
        logger.info("Test application started");
		SpringApplication.run(SpringJenkinsIntegrationApplication.class, args);
	}
}
