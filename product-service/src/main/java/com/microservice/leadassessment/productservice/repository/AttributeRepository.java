package com.microservice.leadassessment.productservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.leadassessment.productservice.entity.Attributes;
import com.microservice.leadassessment.productservice.entity.Product;

public interface AttributeRepository extends JpaRepository<Attributes, Long>{

	List<Attributes> findByproductName(String productName);
	
}
