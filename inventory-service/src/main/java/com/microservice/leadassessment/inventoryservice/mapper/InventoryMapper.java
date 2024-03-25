package com.microservice.leadassessment.inventoryservice.mapper;

import com.microservice.leadassessment.inventoryservice.dto.InventoryDto;
import com.microservice.leadassessment.inventoryservice.entity.Inventory;

public class InventoryMapper {

	public static InventoryDto mapToInventoryDto(Inventory inventory) {
		InventoryDto inventoryDto = new InventoryDto(
				inventory.getTotal(),
				inventory.getAvailable(),
				inventory.getReserved(),
				inventory.getProductName()
		);
		return inventoryDto;
	} 
	
	public static Inventory mapToInventory(InventoryDto inventoryDto) {
		Inventory inventory= new Inventory(
				inventoryDto.getTotal(),
				inventoryDto.getAvailable(),
				inventoryDto.getReserved(),
				inventoryDto.getProductName()
		);
		return inventory;
	}
}
