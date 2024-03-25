package com.microservice.leadassessment.priceservice.entity;

import lombok.*;

import jakarta.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "price")
@IdClass(CompositePricekey.class)
public class Price {
    	
	@Id
    private String currency;	
    private String amount;
	@Id
    private String productName;
   
}