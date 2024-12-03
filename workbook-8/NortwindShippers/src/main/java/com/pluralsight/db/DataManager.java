package com.pluralsight.db;

import com.pluralsight.model.Shipper;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private DataSource dataSource;

    public DataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Shipper> getShippers() {
        List<Shipper> shippers = new ArrayList<>();

        try (Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM shippers;")) {

            try (ResultSet results = preparedStatement.executeQuery()) {
                while (results.next()) {
                    int shipperId = results.getInt("ShipperID");
                    String companyName = results.getString("CompanyName");
                    String phoneNumber = results.getString("Phone");

                    Shipper shipper = new Shipper(shipperId, companyName, phoneNumber);
                    shippers.add(shipper);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return shippers;
    }

    public void insertIntoWithGeneratedKeys(String companyName, String phoneNumber) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO shippers (CompanyName, Phone) VALUES (?, ?) ;", PreparedStatement.RETURN_GENERATED_KEYS)) {
                         preparedStatement.setString(1, companyName);
                         preparedStatement.setString(2, phoneNumber);

                         int rows = preparedStatement.executeUpdate();

            System.out.println("Rows Inserted: " + rows);

            try (ResultSet keys = preparedStatement.getGeneratedKeys()) {
                while (keys.next()) {
                    System.out.println("A new key was added: " + keys.getInt(1));
                }
            }
        } catch (Exception ex) {
            System.out.println("An error has occured!");
            ex.printStackTrace();
        }
    }

    public void updateRecord(String newPhone, int shipperID) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE Shippers SET Phone = ? WHERE ShipperID = ?")) {
            preparedStatement.setString(1, newPhone);
            preparedStatement.setInt(2, shipperID);

            int rows = preparedStatement.executeUpdate();

            System.out.println("Rows Updated: " + rows);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void deleteRecord(int shipperID) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM shippers WHERE shipperID = ?")) {
            preparedStatement.setInt(1, shipperID);

            int rows = preparedStatement.executeUpdate();
            System.out.println("Rows Deleted: " + rows);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}