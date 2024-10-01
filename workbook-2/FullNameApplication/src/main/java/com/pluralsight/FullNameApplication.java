package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        // Variables
        String fullName;
        String firstName;
        String middleName;
        String lastName;
        String emptyMiddleName; // To test is middle name is empty
        String suffix;
        Scanner scanner = new Scanner(System.in);

        // Name Input
        System.out.println("Please enter your name");
        System.out.print("First Name: ");
        firstName = captureName(scanner.nextLine());

        System.out.print("Middle name: ");
        middleName = captureName(scanner.nextLine());
        middleName = !(middleName.isEmpty()) ? middleName.charAt(0) + ". " : middleName ;

        System.out.print("Last name: ");
        lastName = captureName(scanner.nextLine());

        System.out.print("Suffix: ");
        suffix = captureName(scanner.nextLine());

        // Ternary to determine if there is a suffix, or not
        fullName = suffix.isEmpty() ? firstName + middleName + lastName.trim() :
                firstName + middleName + lastName.trim() + ", " + suffix.trim();

        // Final Output
        System.out.println("Full name: " +  fullName);
    }

    // Uses Ternary to determine if there was an input and returns the string trimmed, if so.
    private static String captureName(String name) {
        return name.trim().isEmpty() ? "" : name.trim() + " ";
    }
}