package com.pluralsight.NortwindTradersSpringBoot.dao.interfaces;

import com.pluralsight.NortwindTradersSpringBoot.model.Product;

import java.util.List;

public interface IProductDAO {
    Product insert(Product product);
    List<Product> getAll();
    Product getById(int productId);
    void update(int productId, Product product);
    void delete(int productId);
}
