package com.jesus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootTwoJenkinApplicationTests {
	
	public static Logger logger=LoggerFactory.getLogger(SpringBootTwoJenkinApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Application test case executed.......");
		logger.info("Application test case executed second commit.......");
		assertEquals(true,true);
	}

}
