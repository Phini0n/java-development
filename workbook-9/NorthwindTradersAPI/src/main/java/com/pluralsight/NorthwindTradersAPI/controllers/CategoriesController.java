package com.pluralsight.NorthwindTradersAPI.controllers;

import com.pluralsight.NorthwindTradersAPI.models.Category;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoriesController {
    private List<Category> categories;

    public CategoriesController() {
        categories = new ArrayList<>();
        // Add
        categories.add(new Category(10, "Beverages"));
        categories.add(new Category(20, "Snacks"));
        categories.add(new Category(30, "Dairy"));
        categories.add(new Category(40, "Frozen Foods"));
        categories.add(new Category(50, "Produce"));
    }

    @RequestMapping(path = "/categories", method = RequestMethod.GET)
    public List<Category> getAllCategories() {
        return categories;
    }

    @RequestMapping(path = "/categories/{categoryID}", method = RequestMethod.GET)
    public Category getCategoryByID(@PathVariable int categoryID) {
        for (Category category : categories) {
            if (category.getCategoryID() == categoryID) {
                return category;
            }
        }
        return null;
    }

}
