package com.pluralsight.NorthwindTradersAPI.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;

@Data
@Getter
@AllArgsConstructor
public class Product {
    private int productID;
    private String productName;
    private int categoryID;
    private BigDecimal unitPrice;
}
