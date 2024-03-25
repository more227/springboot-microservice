package com.microservice.leadassessment.productservice.entity;



import lombok.*;


import jakarta.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "attributes")
@IdClass(CompositeAttributeskey.class)
public class Attributes {
    
	@Id
    private String name;	
    private String value;
	@Id
    private String productName;
   
   
}