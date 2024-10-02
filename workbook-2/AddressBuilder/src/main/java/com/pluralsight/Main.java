package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide your Full Name: ");
        sb.append(scanner.nextLine()).append("\n\n");
        buildAddress(sb, scanner, "Billing");
        System.out.println();
        buildAddress(sb, scanner, "Shipping");

        System.out.println(sb);
    }

    public static void buildAddress(StringBuilder sb, Scanner scanner, String addressType) {
        sb.append(addressType).append(" Address: \n");
        System.out.print(addressType + " Street: ");
        sb.append(scanner.nextLine()).append("\n");
        System.out.print(addressType + " City: ");
        sb.append(scanner.nextLine()).append(", ");
        System.out.print(addressType + " State: ");
        sb.append(scanner.nextLine()).append(" ");
        System.out.print(addressType + " Zip: ");
        sb.append(scanner.nextLine()).append("\n\n");
    }
}