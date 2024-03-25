package com.microservice.leadassessment.productservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.microservice.leadassessment.productservice.dto.InventoryDto;
import com.microservice.leadassessment.productservice.dto.PriceDto;
import com.microservice.leadassessment.productservice.dto.SaveInventoryDto;
import com.microservice.leadassessment.productservice.dto.SavePriceDto;

@FeignClient(name="INVENTORY-SERVICE")
public interface InventoryAPIClient {
	
    @GetMapping("api/shopping/inventory/{productName}")
    InventoryDto getInventory(@PathVariable("productName") String productName);

    @DeleteMapping("api/shopping/inventory/{productName}")
	String deleteInventory(@PathVariable("productName") String productName);
    
    @PostMapping("api/shopping/inventory")
    InventoryDto saveInventory(@RequestBody SaveInventoryDto inventoryDto);
}
