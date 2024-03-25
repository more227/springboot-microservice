package com.microservice.leadassessment.inventoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.leadassessment.inventoryservice.dto.InventoryDto;
import com.microservice.leadassessment.inventoryservice.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long>{

	Inventory findByproductName(String productName);
	
}
