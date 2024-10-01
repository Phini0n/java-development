package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fullName;
        String firstName;
        String middleName;
        String lastName;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        fullName = scanner.nextLine();

        String[] splitName = fullName.trim().split("\\s");

        switch (splitName.length) {
            case 3 :
                firstName = splitName[0];
                middleName = splitName[1];
                lastName = splitName[2];
                break;
            case 2 :
                firstName = splitName[0];
                middleName = "(none)";
                lastName = splitName[1];
                break;
            case 1 :
                firstName = splitName[0];
                middleName = "(none)";
                lastName = "(none)";
                break;
            case 0 :
                System.out.println("Error: No name was given, exiting");
                return;
            default:
                System.out.println("Error: Maximum amount of names surpassed, exiting.");
                return;
        }

        System.out.println("First Name: " + firstName + "\n" +
                           "Middle Name: " + middleName + "\n" +
                           "Last Name: " + lastName);
    }
}