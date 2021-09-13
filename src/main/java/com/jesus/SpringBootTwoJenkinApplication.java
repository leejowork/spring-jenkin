package com.jesus;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTwoJenkinApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringBootTwoJenkinApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application started jesus.......");
	}

	public static void main(String[] args) {
		logger.info("Application executed jesus.......");
		SpringApplication.run(SpringBootTwoJenkinApplication.class, args);
	}

}
