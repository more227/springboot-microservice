package com.microservice.leadassessment.priceservice.service;

import com.microservice.leadassessment.priceservice.dto.PriceDto;

public interface PriceService {
	
	 PriceDto savePrice(PriceDto priceDto);
	 PriceDto getPriceByproductName(String productName);
	 void deletePriceByproductName(String productName);
}
