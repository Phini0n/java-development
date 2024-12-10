package com.pluralsight.NorthwindTradersAPI.models;


import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    private int categoryID;
    private String categoryName;
}
