package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone();
        CellPhone phone1 = new CellPhone();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Phone 1:");
        getPhone(phone, scanner);
        System.out.println("\n Phone 2:");
        getPhone(phone1, scanner);
        System.out.println();

        phone.dial(phone1.getPhoneNumber());
        System.out.println();
        phone1.dial(phone.getPhoneNumber());
    }

    private static void getPhone(CellPhone phone, Scanner scanner) {
        System.out.print("What is the serial number? ");
        phone.setSerialNumber(scanner.nextLong());
        System.out.print("What model is the phone? ");
        phone.setModel(scanner.next());
        System.out.print("Who is the carrier? ");
        phone.setCarrier(scanner.next());
        System.out.print("What is the phone number? ");
        phone.setPhoneNumber(scanner.next());
        System.out.print("Who is the owner of the phone? ");
        phone.setOwner(scanner.next());
    }

    public static void display(CellPhone phone) {
        System.out.println(phone.toString());
    }
}