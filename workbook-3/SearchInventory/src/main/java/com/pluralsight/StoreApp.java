package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StoreApp {

    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();

        inventory.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        Scanner scanner = new Scanner(System.in);

        System.out.println("We carry the following inventory: ");

        for (Product product : inventory) {
            System.out.printf("id: %d %s - Price: $%.2f",
                    product.getId(), product.getName(), product.getPrice());
            System.out.println();
        }
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/" + "inventory.csv"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split("\\|");
                inventory.add(new Product(Integer.parseInt(str[0]), str[1], (float) Double.parseDouble(str[2])));
            }
        } catch ( Exception e) {
            System.err.println("Error: " + e);
        }
        return inventory;
    }
}