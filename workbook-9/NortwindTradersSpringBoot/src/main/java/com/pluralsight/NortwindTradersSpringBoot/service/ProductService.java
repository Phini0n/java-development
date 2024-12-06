package com.pluralsight.NortwindTradersSpringBoot.service;

import com.pluralsight.NortwindTradersSpringBoot.dao.interfaces.IProductDAO;
import com.pluralsight.NortwindTradersSpringBoot.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {
    private final IProductDAO productDao;

    @Autowired
    public ProductService(IProductDAO productDao) {
        this.productDao = productDao;
    }

    public Product addProduct(Product product) {
        return productDao.insert(product);
    }

    public List<Product> getAllProducts() {
        return productDao.getAll();
    }

    public Product getProductById(int productId) {
        return productDao.getById(productId);
    }

    public void updateProduct(int productId, Product product) {
        productDao.update(productId, product);
    }

    public void deleteProduct(int productId) {
        productDao.delete(productId);
    }
}