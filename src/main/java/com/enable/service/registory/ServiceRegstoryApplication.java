package com.enable.service.registory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ServiceRegstoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegstoryApplication.class, args);
	}

}
