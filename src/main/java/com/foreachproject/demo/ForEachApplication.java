package com.foreachproject.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class ForEachApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForEachApplication.class, args);
	}

}
