package com.microservice.leadassessment.priceservice.mapper;

import com.microservice.leadassessment.priceservice.dto.PriceDto;
import com.microservice.leadassessment.priceservice.entity.Price;

public class PriceMapper {
	
	public static PriceDto mapToPriceDto(Price price) {
		PriceDto priceDto = new PriceDto(				
				price.getCurrency(),
				price.getAmount(),
				price.getProductName()
		);
		return priceDto;
	} 
	
	public static Price mapToPrice(PriceDto priceDto) {
		Price price= new Price(
				priceDto.getCurrency(),
				priceDto.getAmount(),
				priceDto.getProductName()
		);
		return price;
	}

}
