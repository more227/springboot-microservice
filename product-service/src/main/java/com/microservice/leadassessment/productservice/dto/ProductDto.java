package com.microservice.leadassessment.productservice.dto;

import java.util.List;

import com.microservice.leadassessment.productservice.entity.Attributes;

import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

	private String productname;
    private String brand;
    private String description;
    private PriceDto price;
    private InventoryDto inventory;
    private List<AttributesDto> attributes;
}
