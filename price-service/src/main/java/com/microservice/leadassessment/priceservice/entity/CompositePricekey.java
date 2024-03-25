package com.microservice.leadassessment.priceservice.entity;

import java.io.Serializable;

import jakarta.persistence.Id;

public class CompositePricekey implements Serializable{

	private String currency;   
    private String productName;
}
