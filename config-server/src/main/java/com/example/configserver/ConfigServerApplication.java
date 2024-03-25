package com.example.configserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Lazy;

import com.netflix.discovery.EurekaClient;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
	
	@Autowired
    @Lazy
    private EurekaClient eurekaClient;


	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
