package com.example.logging.demologging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoLoggingApplication {

	public static void main(String[] args) {
		System.out.println("hii");
		SpringApplication.run(DemoLoggingApplication.class, args);
	}

}
