package com.microservice.leadassessment.inventoryservice.entity;


import lombok.*;

import jakarta.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "inventory")
public class Inventory {
		
    private String total;
    private String available;
    private String reserved;
    @Id
    private String productName;
   
}