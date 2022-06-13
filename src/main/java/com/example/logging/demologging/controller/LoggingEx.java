package com.example.logging.demologging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingEx {
	Logger logger=LoggerFactory.getLogger(LoggingEx.class);
	
	@GetMapping("/welcome")
	public String HiMesg() {
		logger.info("hii");
		logger.warn("good");
		return "Good morning";
	}

}
