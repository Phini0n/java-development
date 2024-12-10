package com.pluralsight.NorthwindTradersAPI.dao.interfaces;

import com.pluralsight.NorthwindTradersAPI.models.Product;

import java.util.List;

public interface IProductDAO {
    Product insert(Product product);
    List<Product> getAll();
    Product getById(int productId);
    void update(int productId, Product product);
    void delete(int productId);
}
