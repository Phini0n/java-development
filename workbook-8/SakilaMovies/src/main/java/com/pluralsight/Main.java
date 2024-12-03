package com.pluralsight;

import com.pluralsight.db.DataManager;
import com.pluralsight.model.Actor;
import com.pluralsight.model.Film;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;
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

            DataManager dataManager = new DataManager(dataSource);

            List<Actor> actors = dataManager.getAllActors();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an actor first name: ");
            String actorName = scanner.nextLine().trim();
            actors.stream()
                    .filter(actor -> actor.getFirstName().equalsIgnoreCase(actorName))
                    .forEach(System.out::println);

            System.out.print("Enter an actorID: ");
            int userActorID = scanner.nextInt();

            List<Film> films = dataManager.getActorAndFilm(userActorID);

            actors.stream()
                    .filter(actor -> actor.getActorId() == userActorID)
                    .forEach(System.out::println);
            films.forEach(System.out::println);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}