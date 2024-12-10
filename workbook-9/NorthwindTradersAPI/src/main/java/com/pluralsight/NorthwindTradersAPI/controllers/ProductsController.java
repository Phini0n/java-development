package com.pluralsight.NorthwindTradersAPI.controllers;

import com.pluralsight.NorthwindTradersAPI.models.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductsController {
    private List<Product> products;

    public ProductsController() {
        products = new ArrayList<>();
        // Add
        products.add(new Product(1, "Product 1", 10, new BigDecimal("19.99")));
        products.add(new Product(2, "Product 2", 10, new BigDecimal("29.99")));
        products.add(new Product(3, "Product 3", 20, new BigDecimal("39.99")));
        products.add(new Product(4, "Product 4", 20, new BigDecimal("49.99")));
        products.add(new Product(5, "Product 5", 30, new BigDecimal("59.99")));
    }

    @RequestMapping(path = "/products", method = RequestMethod.GET)
    public List<Product> getAllProducts() {
        return products;
    }

    @RequestMapping(path = "/products/{productID}", method = RequestMethod.GET)
    public Product getProductByID(@PathVariable int productID) {
        for (Product product : products) {
            if (product.getProductID() == productID) {
                return product;
            }
        }
        return null;
    }
}