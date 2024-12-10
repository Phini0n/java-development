package com.pluralsight.NorthwindTradersAPI.dao.impl;

import com.pluralsight.NorthwindTradersAPI.dao.interfaces.IProductDAO;
import com.pluralsight.NorthwindTradersAPI.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcProductDAO implements IProductDAO{
    private DataSource dataSource;
    @Autowired
    public JdbcProductDAO(DataSource dataSource){
        this.dataSource = dataSource;
    }

    @Override
    public Product insert(Product product) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();

        String sql = "SELECT * FROM Products;";

        try(Connection connection = dataSource.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet rows = statement.executeQuery(sql);
            while(rows.next()) {
                Product product = new Product();
                product.setProductID(rows.getInt("ProductID"));
                product.setProductName(rows.getString("ProductName"));
                product.setCategoryID(rows.getInt("CategoryID"));
                product.setUnitPrice(rows.getBigDecimal("UnitPrice"));
                products.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public Product getById(int productId) {
        return null;
    }

    @Override
    public void update(int productId, Product product) {

    }

    @Override
    public void delete(int productId) {

    }
}
