package com.pluralsight.NortwindTradersSpringBoot.dao;

import com.pluralsight.NortwindTradersSpringBoot.model.Product;

import java.util.List;

public interface ProductDao {
    void addProduct(Product product);
    List<Product> getAll();
}
