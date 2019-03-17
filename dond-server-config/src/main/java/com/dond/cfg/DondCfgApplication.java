package com.dond.cfg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DondCfgApplication {

	public static void main(String[] args) {
		SpringApplication.run(DondCfgApplication.class, args);
	}
}
