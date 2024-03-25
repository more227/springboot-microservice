package com.microservice.leadassessment.inventoryservice.service;

import com.microservice.leadassessment.inventoryservice.dto.InventoryDto;

public interface InventoryService {

	 InventoryDto saveInventory(InventoryDto inventoryDto);
	 InventoryDto getInventoryByproductName(String productName);
	 void deleteInventoryByproductName(String productName);
}
