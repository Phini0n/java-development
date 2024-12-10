package com.pluralsight.NorthwindTradersAPI.dao.interfaces;

import com.pluralsight.NorthwindTradersAPI.models.Category;
import java.util.List;

public interface ICategoryDAO {
    Category insert(Category category);
    List<Category> getAll();
    Category getById(int categoryId);
    void update(int categoryId, Category category);
    void delete(int categoryId);
}