package com.docjenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class DocjenkinsApplication {
	private static final Logger logger = LoggerFactory.getLogger(DocjenkinsApplication.class);

	public static void main(String[] args) {
		logger.info("Jenkins Application Started");
		SpringApplication.run(DocjenkinsApplication.class, args);
	}

}
