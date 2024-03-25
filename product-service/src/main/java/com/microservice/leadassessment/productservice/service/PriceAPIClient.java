package com.microservice.leadassessment.productservice.service;

import org.json.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.microservice.leadassessment.productservice.dto.InventoryDto;
import com.microservice.leadassessment.productservice.dto.PriceDto;
import com.microservice.leadassessment.productservice.dto.SavePriceDto;

@FeignClient(name="PRICE-SERVICE")
public interface PriceAPIClient {
	
    @GetMapping("api/shopping/price/{productName}")
    PriceDto getPriceByProductName(@PathVariable("productName") String productName);
    
    @DeleteMapping("api/shopping/price/{productName}")
	String deletePrice(@PathVariable("productName") String productName);
    
    @PostMapping("api/shopping/price")
    PriceDto savePrice(@RequestBody SavePriceDto priceDto);
}
