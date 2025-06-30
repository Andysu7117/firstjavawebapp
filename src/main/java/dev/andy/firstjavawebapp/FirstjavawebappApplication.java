package dev.andy.firstjavawebapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstjavawebappApplication {
	
	private final static Logger logger = LoggerFactory.getLogger(FirstjavawebappApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(FirstjavawebappApplication.class, args);
		logger.info("Welcome to my first java webapp");
		logger.info("Does this change on save");
	}

}
