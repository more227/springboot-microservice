package com.microservice.leadassessment.priceservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.microservice.leadassessment.priceservice.dto.PriceDto;
import com.microservice.leadassessment.priceservice.service.PriceService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/shopping/price")
@AllArgsConstructor
public class PriceController {

	private PriceService priceService;
	
	@PostMapping
    public ResponseEntity<PriceDto> savePrice(@RequestBody PriceDto priceDto){
        PriceDto savedPrice = priceService.savePrice(priceDto);
        return new ResponseEntity<>(savedPrice, HttpStatus.CREATED);
    }

    
    @GetMapping("{productName}")
    public ResponseEntity<PriceDto> getPriceByProductName(@PathVariable("productName") String productName){
        PriceDto priceDto = priceService.getPriceByproductName(productName);
        return new ResponseEntity<>(priceDto, HttpStatus.OK);
    }
    
    @DeleteMapping("{productName}")
	public ResponseEntity<String> deletePrice(@PathVariable("productName") String productName){
    	priceService.deletePriceByproductName(productName);
	    return new ResponseEntity<>("Price successfully deleted!", HttpStatus.OK);
	}
}
