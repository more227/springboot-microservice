package com.microservice.leadassessment.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.leadassessment.productservice.entity.Product;

public interface ProductRepository extends JpaRepository<Product, String>{
	
	Product findByproductname(String productname);

}