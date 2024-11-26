package com.pluralsight;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) {

        try {

            if (args.length !=2) {
                System.out.println("The application needs a Username and Password to run.");
                System.exit(1);
            }

            String username = args[0];
            String password = args[1];

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind",
                    username,
                    password
            );

            String query = """
                    SELECT productID, productName, unitPrice, unitsInStock
                    FROM products;
                    """;

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            ResultSet results = preparedStatement.executeQuery(query);

            ArrayList<String> productList = getProductList(results);

            for (String product : productList) {
                System.out.println(product);
            }

            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static ArrayList<String> getProductList(ResultSet results) throws SQLException {
        ArrayList<String> listOfProducts = new ArrayList<String>();
        int productID, stock;
        String productName;
        BigDecimal unitPrice;

        while (results.next()) {

            productID = results.getInt("productID");
            stock = results.getInt("unitsInStock");
            productName = results.getString("productName");
            unitPrice = results.getBigDecimal("unitPrice");
            unitPrice = unitPrice.setScale(2, RoundingMode.CEILING);

            listOfProducts.add(String.format(
                    """
                    Product Id: %d
                    Name: %s
                    Price: %s
                    Stock: %d
                    
                    -------------
                    
                    """,
                    productID, productName, unitPrice, stock
            ));
        }
        return listOfProducts;
    }
}