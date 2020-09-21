package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.LimitConfiguration;
import com.example.demo.limitservice.Configuration;

@RestController
public class LimitConfigController {
	
	@Autowired
	private Configuration config;
	
	@GetMapping("/limits")
	public LimitConfiguration retriveLimitsFromConfiguration() {
		return new LimitConfiguration(config.getMaximum(),config.getMinimum());
		
	}

}
