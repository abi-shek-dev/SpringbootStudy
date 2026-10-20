package com.xeno.SimpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Product {

    @Id
    private int proId;
    private String prodName;
    private int price;
    
}
