package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone();
        Scanner scanner = new Scanner(System.in);

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

        System.out.println(phone);
    }
}