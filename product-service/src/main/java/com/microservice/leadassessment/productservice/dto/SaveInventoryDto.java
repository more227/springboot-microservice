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
public class SaveInventoryDto {
	
   private String total;
   private String available;
   private String reserved;
   private String productName;


}