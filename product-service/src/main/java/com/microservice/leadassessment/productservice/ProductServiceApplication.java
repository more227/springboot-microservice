package com.microservice.leadassessment.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.EurekaClient;

@SpringBootApplication
@EnableFeignClients
public class ProductServiceApplication {

	@Bean
	//@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
	@Autowired
    @Lazy
    private EurekaClient eurekaClient;
	
	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

}
