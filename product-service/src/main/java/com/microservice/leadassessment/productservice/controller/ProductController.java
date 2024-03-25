package com.microservice.leadassessment.productservice.controller;

import java.util.List;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.microservice.leadassessment.productservice.dto.ProductDto;
import com.microservice.leadassessment.productservice.service.ProductService;


import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/shopping/product")
@AllArgsConstructor
public class ProductController {

	private ProductService productService;
	
	@PostMapping
    public ResponseEntity<ProductDto> saveProduct(@RequestBody ProductDto productDto){
		ProductDto savedProduct = productService.saveProduct(productDto);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }
	
	@GetMapping("{productName}")
    public ResponseEntity<Object> getProduct(@PathVariable("productName") String productName){
		ProductDto productDto = productService.getProductByname(productName);
		if(productDto !=null)
			return new ResponseEntity<>(productDto, HttpStatus.OK);
		else
		{
			 return new ResponseEntity<>("Product not found!", HttpStatus.OK);
		}
    }
	
	@DeleteMapping("{productName}")
	public ResponseEntity<String> deleteProduct(@PathVariable("productName") String productName){
		  productService.deleteProductByname(productName);
	        return new ResponseEntity<>("Product successfully deleted!", HttpStatus.OK);
	}
	
	@GetMapping()
    public ResponseEntity<Object> getAllProducts(){
		List<ProductDto> productDtolist = productService.getAllProducts();
		if(productDtolist !=null)
			return new ResponseEntity<>(productDtolist, HttpStatus.OK);
		else
		{
			 return new ResponseEntity<>("No Product exist!", HttpStatus.OK);
		}
    }
	
}