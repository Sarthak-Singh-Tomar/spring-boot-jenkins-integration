package com.springboot.tutorial.springjenkinsintegration.api;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringJenkinsIntegrationApplicationTests {

	public static Logger logger =
			LoggerFactory.getLogger(SpringJenkinsIntegrationApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing...");
		assertTrue(true);
		logger.info("Test: final commit as Jenkins tutoral completed successfully");
	}

}
