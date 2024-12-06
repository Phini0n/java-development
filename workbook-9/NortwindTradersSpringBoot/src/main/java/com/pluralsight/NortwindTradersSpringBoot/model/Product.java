package com.pluralsight.NortwindTradersSpringBoot.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Product {
    private int productID;
    private String name;
    private String category;
    private BigDecimal price;
}
