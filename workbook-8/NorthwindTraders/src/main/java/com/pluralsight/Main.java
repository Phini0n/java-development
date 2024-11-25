package com.pluralsight;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.*;
import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) {
        Connection connection;

        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306",
                    "root",
                    "P@ssw0rd"
            );

            Statement statement = connection.createStatement();

            String query = "SELECT * FROM northwind.products;";

            ResultSet results = statement.executeQuery(query);

            while (results.next()) {
                System.out.println(results.getString("ProductName"));
            }

            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}