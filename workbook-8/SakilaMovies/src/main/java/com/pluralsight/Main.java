package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ResultSet results = null;
        PreparedStatement preparedStatement = null;
        Connection connection = null;

        try {

            if (args.length != 2) {
                System.out.println("The application needs a Username and a Password!");
                System.exit(1);
            }

            String username = args[0];
            String password = args[1];

            BasicDataSource dataSource = new BasicDataSource();
            dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
            dataSource.setUsername(username);
            dataSource.setPassword(password);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first and last name or last name of an actor you like I'll display the movies they're in: ");
            String lastName = scanner.nextLine();


            boolean isValidName;
            do {
                isValidName = doNameQuery(dataSource, lastName.split(" ", 2));
            } while (isValidName != true);

        } catch (Exception ex) {
            System.out.println("An error has occurred!");
            ex.printStackTrace();
        }
    }

    public static boolean doNameQuery(DataSource dataSource, String[] namesToSearch) {
        String query;
        switch (namesToSearch.length) {
            case 1: // Last name
                query = """
                                SELECT * FROM sakila.actor
                                JOIN sakila.film_actor ON sakila.actor.actor_id = sakila.film_actor.actor_id
                                JOIN sakila.film ON film_actor.film_id = film.film_id
                                WHERE actor.last_name = ?;
                                """;
                doQuery(dataSource, query, namesToSearch[0]);
                return true;
            case 2: // First Name, Last Name
                query = """
                                SELECT * FROM sakila.actor 
                                JOIN sakila.film_actor ON sakila.actor.actor_id = sakila.film_actor.actor_id
                                JOIN sakila.film ON film_actor.film_id = film.film_id
                                WHERE CONCAT(actor.last_name,' ',actor.first_name) = ?
                                """;
                doQuery(dataSource, query, namesToSearch[1] + " " + namesToSearch[0]);
                return true;
            default: // Neither
                System.out.println("You need to enter a first and last name or just a last name!");
                return false;
        }
    }

    public static void doQuery(DataSource dataSource, String query, String criteria) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, criteria);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                printResultSet(resultSet);
            }
        } catch (Exception ex) {
            System.out.println("An error has occurred!");
            ex.printStackTrace();
        }
    }

    public static void printResultSet(ResultSet resultSet) {
        try (resultSet) {
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            if (!resultSet.isBeforeFirst() ) {
                System.out.println("No data");
                return;
            }

            for (int i = 1; i <= columnCount; i ++) {
                System.out.print(metaData.getColumnName(i) + " ");
            }
            System.out.println();

            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(resultSet.getString(i) + " ");
                }
                System.out.println();
            }

        } catch (Exception ex) {
            System.out.println("An error has occurred!");
            ex.printStackTrace();
        }
    }
}