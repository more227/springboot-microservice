package com.microservice.leadassessment.inventoryservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.leadassessment.inventoryservice.dto.InventoryDto;
import com.microservice.leadassessment.inventoryservice.service.InventoryService;


import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/shopping/inventory")
@AllArgsConstructor
public class InventoryController {

private InventoryService inventoryService;
	
	@PostMapping
    public ResponseEntity<InventoryDto> saveInventory(@RequestBody InventoryDto inventoryDto){
		InventoryDto savedInventory = inventoryService.saveInventory(inventoryDto);
        return new ResponseEntity<>(savedInventory, HttpStatus.CREATED);
    }

    
    @GetMapping("{productName}")
    public ResponseEntity<InventoryDto> getInventory(@PathVariable("productName") String productName){
    	InventoryDto inventoryDto = inventoryService.getInventoryByproductName(productName);
        return new ResponseEntity<>(inventoryDto, HttpStatus.OK);
    }
    
    @DeleteMapping("{productName}")
	public ResponseEntity<String> deleteInventory(@PathVariable("productName") String productName){
    	inventoryService.deleteInventoryByproductName(productName);
	    return new ResponseEntity<>("Inventory successfully deleted!", HttpStatus.OK);
	}
}
