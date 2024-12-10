package com.pluralsight.NorthwindTradersAPI.models;

import lombok.*;

import java.math.BigDecimal;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int productID;
    private String productName;
    private int categoryID;
    private BigDecimal unitPrice;
}
