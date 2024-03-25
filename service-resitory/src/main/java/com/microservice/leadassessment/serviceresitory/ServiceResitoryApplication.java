package com.microservice.leadassessment.serviceresitory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceResitoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceResitoryApplication.class, args);
	}

}
