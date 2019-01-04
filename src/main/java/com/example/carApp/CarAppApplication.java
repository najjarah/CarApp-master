package com.example.carApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//74








@SpringBootApplication
public class CarAppApplication {
	private static final Logger logger = LoggerFactory.getLogger(CarAppApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CarAppApplication.class, args);
		logger.info("Hello Spring Boot");
	}

}

