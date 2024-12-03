package com.pluralsight.db;

import com.pluralsight.model.Actor;
import com.pluralsight.model.Film;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataManager {
    private DataSource datasource;

    public DataManager(DataSource dataSource) {
        this.datasource = dataSource;
    }

    public List<Actor> getAllActors() {
        List<Actor> actors = new ArrayList<>();
        String actorsQuery = "SELECT Actor_ID, First_Name, Last_Name FROM actor";

        try (Connection connection = datasource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(actorsQuery);
        ResultSet results = preparedStatement.executeQuery()) {
            while (results.next()) {
                int actorID = results.getInt(1);
                String firstName = results.getString(2);
                String lastName = results.getString(3);

                Actor actor = new Actor(actorID, firstName, lastName);
                actors.add(actor);
            }
        } catch (Exception ex) {
            System.out.println("An error has occurred!");
            ex.printStackTrace();
        }
        return actors;
    }

    public List<Film> getActorAndFilm(int actorID) {
        String actorQuery = """
                                SELECT actor.Actor_ID, actor.First_Name, actor.Last_Name, film.film_id, film.title, film.description, film.release_year, film.length
                                FROM actor
                                JOIN film_actor ON actor.actor_id = film_actor.actor_id
                                JOIN film ON film_actor.film_id = film.film_id
                                WHERE actor.actor_id = ?;
                                """;
        List<Film> films = new ArrayList<>();

        try (Connection connecion = datasource.getConnection();
             PreparedStatement preparedStatement = connecion.prepareStatement(actorQuery)) {
            preparedStatement.setInt(1, actorID);

            try (ResultSet results = preparedStatement.executeQuery()) {
                while (results.next()) {

                    int filmID = results.getInt(4);
                    String title = results.getString(5);
                    String description = results.getString(6);
                    LocalDate localDate = results.getDate(7).toLocalDate();
                    int length = results.getInt(8);

                    Film film = new Film(filmID, title, description, localDate, length);
                    films.add(film);
                }
            }
        } catch (Exception ex) {
            System.out.println("An error has occurred!");
            ex.printStackTrace();
        }
        return films;
    }
}
