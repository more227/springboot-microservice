package com.microservice.leadassessment.productservice.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SavePriceDto {
	
	private String currency;
	private String amount;
	private String productName;

}