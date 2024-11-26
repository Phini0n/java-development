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

        ResultSet results = null;
        PreparedStatement preparedStatement = null;
        Connection connection = null;

        try {

            if (args.length != 2) {
                System.out.println("The application needs a Username and Password to run.");
                System.exit(1);
            }

            String username = args[0];
            String password = args[1];

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind",
                    username,
                    password
            );

            String productQuery = """
                    SELECT productID, productName, unitPrice, unitsInStock
                    FROM products;
                    """;

            String customerQuery = """
                    SELECT CustomerID, contactName, city, country, phone
                    FROM customers;
                    """;

            String categoryQuery = """
                    SELECT productID, productName, unitPrice, unitsInStock, categoryID
                    FROM products
                    WHERE categoryID =""";

            // User Input
            System.out.print("""
                    What do you want to do?
                    1) Display all products
                    2) Display all customers
                    3) Display all categories
                    0) Exit
                    Select an option:\s""");

            String query = "";

            StringBuilder sb = new StringBuilder();

            Scanner scanner = new Scanner(System.in);

            int choice = scanner.nextInt();
            boolean isRunning = true;
            while (isRunning) {
                switch (choice) {
                    case 1:
                        query = productQuery;
                        isRunning = false;
                        break;
                    case 2:
                        query = customerQuery;
                        isRunning = false;
                        break;
                    case 3:
                        System.out.print("Enter categoryID:\s");

                        int categoryID = scanner.nextInt();

                        sb.append(categoryQuery).append(categoryID).append(";");
                        query = sb.toString();
                        isRunning = false;
                        break;
                    case 0:
                        System.exit(1);
                    default:
                        System.out.println("Enter the correct number, please.");
                }
            }


            preparedStatement = connection.prepareStatement(query);

            results = preparedStatement.executeQuery(query);

            List<String> queryList = new ArrayList<String>();

            if (choice == 1) {
                queryList = getProductList(results);
            }
            if (choice == 3){
                queryList = getProductList(results);
            }else {
                queryList = getCustomerList(results);
            }

            for (String s : queryList) {
                System.out.println(s);
            }

        } catch (Exception e) {
            System.out.println("Error has occurred.");
            e.printStackTrace();

        } finally {
            if (results != null) {
                try {
                    results.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static ArrayList<String> getProductList(ResultSet results) throws SQLException {
        ArrayList<String> listOfProducts = new ArrayList<>();

        while (results.next()) {
            listOfProducts.add(String.format(
                    """
                    Product Id: %d
                    Name: %s
                    Price: %.2f
                    Category ID: %d
                    Stock: %d
                    
                    -------------
                    
                    """,
                    results.getInt("productID"),
                    results.getString("productName"),
                    results.getBigDecimal("unitPrice").setScale(2, RoundingMode.CEILING),
                    results.getInt("categoryID"),
                    results.getInt("unitsInStock")
            ));
        }
        return listOfProducts;
    }

    public static ArrayList<String> getCustomerList(ResultSet results) throws SQLException {
        ArrayList<String> listOfProducts = new ArrayList<>();
        while (results.next()) {
            listOfProducts.add(String.format(
                    """
                    Customer ID: %s
                    Contact Name: %s
                    City: %s
                    Country: %s
                    Phone: %s
                    
                    -------------
                    
                    """,
                    results.getString("CustomerID"),
                    results.getString("contactName"),
                    results.getString("city"),
                    results.getString("country"),
                    results.getString("phone")
            ));
        }
        return listOfProducts;
    }
}