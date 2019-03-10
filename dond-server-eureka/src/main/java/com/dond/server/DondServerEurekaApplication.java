package com.dond.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DondServerEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DondServerEurekaApplication.class, args);
	}

}
