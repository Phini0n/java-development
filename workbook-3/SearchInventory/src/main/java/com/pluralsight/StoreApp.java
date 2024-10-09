package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StoreApp {

    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();

        inventory.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            writeMenu();
            int input = scanner.nextInt();
            System.out.println();
            switch (input) {
                case 1:
                    listInventory(inventory);
                    break;
                case 2:
                    System.out.print("Enter your item: ");
                    int idLookup = scanner.nextInt();
                    System.out.println("\n Searching for your item . . .");
                    int i = 0;
                    for (Product product : inventory) {
                        if (product.getId() == idLookup) {
                            System.out.println(product);
                            i++;
                        }
                    }
                    if (i == 0) { System.out.println("Could not find your item, sorry."); }
                    break;
                case 3:
                    System.out.println("Enter lower bound.");
                    double lowerBound = scanner.nextDouble();
                    System.out.println("Enter upper bound.");
                    double upperBound = scanner.nextDouble();
                    for (Product product : inventory) {
                        if (product.getPrice() > lowerBound && product.getPrice() < upperBound) {
                            System.out.println(product);
                            try { Thread.sleep( 500); } catch (Exception e) { System.out.println(e);}
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Not yet implemented.");
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid input, try again.");
                    continue;
            }
        }
    }

    private static void writeMenu() {
        System.out.print("What do you want to do?" +
                "\n 1 - List all products" +
                "\n 2 - Lookup a product by its id" +
                "\n 3 - Find all products within a price range" +
                "\n 4 - Add a new product" +
                "\n 5 - Quit the application" +
                "\n Enter command: ");
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

    public static void listInventory(ArrayList<Product> inventory) {
        System.out.println("We carry the following inventory: ");
        for (Product product : inventory) {
            System.out.println(product);
            try { Thread.sleep( 500); } catch (Exception e) { System.out.println(e);}
        }
    }
}