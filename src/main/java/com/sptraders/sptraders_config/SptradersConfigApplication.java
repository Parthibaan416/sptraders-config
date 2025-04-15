package com.sptraders.sptraders_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SptradersConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SptradersConfigApplication.class, args);
	}

}
