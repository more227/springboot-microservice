package com.microservice.leadassessment.productservice.service;

import java.util.List;

import com.microservice.leadassessment.productservice.dto.ProductDto;

public interface ProductService {

	 ProductDto saveProduct(ProductDto productDto);
	 ProductDto getProductByname(String name);
	 void deleteProductByname(String name);
	 List<ProductDto> getAllProducts();
	 
}
