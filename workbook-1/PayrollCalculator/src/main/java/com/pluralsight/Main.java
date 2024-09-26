package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        double payRate;
        double hoursWorked;
        double grossPay;
        Scanner scanner = new Scanner(System.in);
        boolean isOvertime = false;

        System.out.print("Hello, we're going to calculate your gross pay. Press enter to continue... ");
        scanner.nextLine();

        System.out.print("Enter your name: ");
        name = scanner.next();
        System.out.print("Enter your pay rate (per hour): ");
        payRate = scanner.nextFloat();
        System.out.print("Enter your hours worked: ");
        hoursWorked = scanner.nextFloat();

        if (hoursWorked > 40) {
            isOvertime = true;
            grossPay = hoursWorked * payRate;
            grossPay *= 1.5;
        } else { grossPay = hoursWorked * payRate; }

        System.out.print("\nYour name is " + name + " and you have worked " + hoursWorked + " hours. Your pay rate is $"
                + String.format("%.2f", payRate) + " per hour. ");
        if (isOvertime) { System.out.print("We've included overtime, as well."); }

        System.out.println("\nYour gross pay is $" + String.format("%.2f", grossPay) +".");
    }
}