package com.pluralsight.NorthwindTradersAPI.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
@AllArgsConstructor
public class Category {
    private int categoryID;
    private String categoryName;
}
