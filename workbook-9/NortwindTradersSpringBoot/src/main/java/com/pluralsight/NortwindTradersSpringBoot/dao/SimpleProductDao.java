package com.pluralsight.NortwindTradersSpringBoot.dao;

import com.pluralsight.NortwindTradersSpringBoot.model.Product;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
@ToString
public class SimpleProductDao implements ProductDao {
    List<Product> products;

    public SimpleProductDao(List<Product> products) {
        products.add(new Product(1, "Apple", "Produce", new BigDecimal("1.50")));
        products.add(new Product(2, "Banana", "Produce", new BigDecimal("0.80")));
        products.add(new Product(3, "Carrot", "Vegetable", new BigDecimal("2.00")));
        products.add(new Product(4, "Donut", "Bakery", new BigDecimal("3.50")));
        products.add(new Product(5, "Eggplant", "Vegetable", new BigDecimal("1.75")));
        this.products = products;
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }
}
