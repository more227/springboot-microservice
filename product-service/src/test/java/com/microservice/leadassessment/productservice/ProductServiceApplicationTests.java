package com.microservice.leadassessment.productservice;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.core.env.Environment;

import com.microservice.leadassessment.productservice.dto.PriceDto;
import com.microservice.leadassessment.productservice.service.PriceAPIClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class ProductServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private PriceAPIClient priceAPIClient;
	
	
	@LocalServerPort
    private int port;

    @Autowired
    private Environment environment;
	
	
	@Test
	public void testPrice() throws Exception
	{
		 
		  
		PriceDto priceDto = priceAPIClient.getPriceByProductName("Laptop");
		System.out.println(priceDto.getAmount()+priceDto.getCurrency());
		
	}
}
