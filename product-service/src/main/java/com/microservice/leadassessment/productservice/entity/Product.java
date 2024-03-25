package com.microservice.leadassessment.productservice.entity;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Product {
	
	@Id	
    private String productname;
    private String brand;
    private String description;
    
    
 
}
