package com.microservice.leadassessment.inventoryservice.service.impl;

import org.springframework.stereotype.Service;

import com.microservice.leadassessment.inventoryservice.service.InventoryService;
import com.microservice.leadassessment.inventoryservice.dto.InventoryDto;
import com.microservice.leadassessment.inventoryservice.entity.Inventory;
import com.microservice.leadassessment.inventoryservice.mapper.InventoryMapper;
import com.microservice.leadassessment.inventoryservice.repository.InventoryRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class InventoryServiceImpl implements InventoryService{

	private InventoryRepository inventoryRepository;
	@Override
	public InventoryDto saveInventory(InventoryDto inventoryDto) {
		Inventory inventory= InventoryMapper.mapToInventory(inventoryDto);
		Inventory savedInventory=inventoryRepository.save(inventory);
		InventoryDto savedInventoryDto = InventoryMapper.mapToInventoryDto(savedInventory);
		
		return savedInventoryDto;
	}

	@Override
	public InventoryDto getInventoryByproductName(String productName) {
		
		Inventory inventory = inventoryRepository.findByproductName(productName);
		InventoryDto inventoryDto = InventoryMapper.mapToInventoryDto(inventory);

	    return inventoryDto;		
	}
	
	@Override
	public void deleteInventoryByproductName(String productName) {
		 Inventory existingInventory = inventoryRepository.findByproductName(productName);
		 if(existingInventory!=null)
			 inventoryRepository.delete(existingInventory);
	}
}