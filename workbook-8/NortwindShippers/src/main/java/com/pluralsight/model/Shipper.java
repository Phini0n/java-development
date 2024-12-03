package com.pluralsight.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Shipper {
    private int shipperID;
    private String companyName;
    private String phone;
}
