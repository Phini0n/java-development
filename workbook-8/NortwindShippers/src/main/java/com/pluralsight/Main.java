package com.pluralsight;

import com.pluralsight.db.DataManager;
import com.pluralsight.model.Shipper;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("User and Passsword are needed!");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];

        BasicDataSource northwindDataSource = new BasicDataSource();
        northwindDataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
        northwindDataSource.setUsername(username);
        northwindDataSource.setPassword(password);

        DataManager dataManager = new DataManager(northwindDataSource);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter shipper data (Name, Phone): ");
        String[] shipperData = scanner.nextLine().split(" ", 2);

        dataManager.insertIntoWithGeneratedKeys(shipperData[0], shipperData[1]);

        updateThing(dataManager);

        System.out.print("Update the Phone Number (PhoneNumber, ID) Enter: ");
        String[] updateData = scanner.nextLine().trim().split(" ", 2);

        dataManager.updateRecord(updateData[0], Integer.parseInt(updateData[1]));

        updateThing(dataManager);

        System.out.print("Delete a Shipper: ");
        int shipperToDelete = scanner.nextInt();

        dataManager.deleteRecord(shipperToDelete);

        updateThing(dataManager);

    }

    public static void updateThing(DataManager dataManager) {
        List<Shipper> shippers = dataManager.getShippers();
        shippers.forEach(System.out::println);
    }
}