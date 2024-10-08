package com.pluralsight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner storyScan;
        String fileName;
        File f;

        boolean stillReading;

        do {

            System.out.print("Please choose one of three stories: \n" +
                    "goldilocks.txt ) Goldilocks and the Three Bears \n" +
                    "hansel_and_gretel.txt ) Hansel and Gretel \n" +
                    "mary_had_a_little_lamb.txt ) Mary Had a Little Lamb \n" +
                    "Enter: ");

            fileName = input.next();
            System.out.println();

            f = new File("./src/" + fileName);

            try {
                storyScan = new Scanner(f);
                int i = 1;
                while (storyScan.hasNextLine()) {
                    System.out.println(i + ". "+ storyScan.nextLine());
                    i++;
                }
            } catch (FileNotFoundException e) {

                throw new RuntimeException(e);
            }

            System.out.println("Would you like to read another story? Enter Y to continue and enter anything else to exit. ");
            stillReading = input.next().equalsIgnoreCase("Y");
        } while (stillReading);

        input.close();
        storyScan.close();
        System.out.println("Goodbye!");
    }
}