package com.microservice.leadassessment.priceservice.service.impl;

import org.springframework.stereotype.Service;

import com.microservice.leadassessment.priceservice.dto.PriceDto;
import com.microservice.leadassessment.priceservice.entity.Price;
import com.microservice.leadassessment.priceservice.mapper.PriceMapper;
import com.microservice.leadassessment.priceservice.repository.PriceRepository;
import com.microservice.leadassessment.priceservice.service.PriceService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PriceServiceImpl implements PriceService{

	private PriceRepository priceRepository;
	@Override
	public PriceDto savePrice(PriceDto priceDto) {
		Price price= PriceMapper.mapToPrice(priceDto);
		Price savedPrice=priceRepository.save(price);
		PriceDto savedPriceDto = PriceMapper.mapToPriceDto(savedPrice);
		
		return savedPriceDto;
	}

	@Override
	public PriceDto getPriceByproductName(String productName) {
		
		 Price price = priceRepository.findByproductName(productName);
	     PriceDto priceDto = PriceMapper.mapToPriceDto(price);

	     return priceDto;		
	}

	@Override
	public void deletePriceByproductName(String productName) {
		 Price existingPrice = priceRepository.findByproductName(productName);
		 if(existingPrice!=null)
			 priceRepository.delete(existingPrice);
	}

}
