package com.pluralsight;
import java.util.Scanner;

public class Main {

    // Final Variables
    private static final double OVERTIME_HOURS = 40;

    public static void main(String[] args) {
        // Variables
        String name;
        double payRate;
        double hoursWorked;
        double grossPay;
        Scanner scanner = new Scanner(System.in);

        // User Input
        System.out.print("Hello, we're going to calculate your gross pay. Press enter to continue... ");
        scanner.nextLine();
        System.out.print("Enter your name: ");
        name = scanner.next();
        System.out.print("Enter your pay rate (per hour): ");
        payRate = scanner.nextFloat();
        System.out.print("Enter your hours worked: ");
        hoursWorked = scanner.nextFloat();

        // Calculations
        boolean hasOvertime = hoursWorked > OVERTIME_HOURS;
        grossPay = calculateGrossPay(payRate, hoursWorked, hasOvertime);

        // Final Input
        System.out.println("Your name is " + name + ". Your gross pay is: $" + String.format("%.2f", grossPay));
        scanner.close();
    }

    private static double calculateGrossPay(double rate, double hours, boolean hasOvertime) {
        if (hasOvertime) { return (OVERTIME_HOURS * rate) + calculateOvertime(rate, hours);  }
        return hours * rate;
    }

    private static double calculateOvertime(double rate, double hours) {
        return (hours - OVERTIME_HOURS) * 1.5 * rate;
    }
}