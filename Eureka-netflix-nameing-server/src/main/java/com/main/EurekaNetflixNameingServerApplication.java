package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaNetflixNameingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaNetflixNameingServerApplication.class, args);
	}

}
