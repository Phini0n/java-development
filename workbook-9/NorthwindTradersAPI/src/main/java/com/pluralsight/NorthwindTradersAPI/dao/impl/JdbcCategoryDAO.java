package com.pluralsight.NorthwindTradersAPI.dao.impl;

import com.pluralsight.NorthwindTradersAPI.dao.interfaces.ICategoryDAO;
import com.pluralsight.NorthwindTradersAPI.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcCategoryDAO implements ICategoryDAO {
    private final DataSource dataSource;

    @Autowired
    public JdbcCategoryDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Category insert(Category category) {
        return null;
    }

    @Override
    public List<Category> getAll() {
        List<Category> categories = new ArrayList<>();
        String sql = "SELECT * FROM Categories;";

        try (Connection connection = dataSource.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet rows = statement.executeQuery(sql);
            while (rows.next()) {
                Category category = new Category();
                category.setCategoryID(rows.getInt("CategoryID"));
                category.setCategoryName(rows.getString("CategoryName"));
                categories.add(category);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return categories;
    }

    @Override
    public Category getById(int categoryId) {
        return null;
    }

    @Override
    public void update(int categoryId, Category category) {
    }

    @Override
    public void delete(int categoryId) {
    }
}