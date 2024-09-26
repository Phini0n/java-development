package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        // Question 1:
        System.out.println("Question 1:");

        float bobSalary = (float) Math.random() * 100000;
        // Rounding bobSalary value to two decimal places.
        bobSalary = (float) Math.round(bobSalary * 100) / 100;
        float garySalary = (float) Math.random() * 100000;
        // Rounding garySalary value to two decimal places.
        garySalary = (float) Math.round(garySalary * 100) / 100;
        float highestSalary;

        highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("Gary's Salary is: $" + garySalary + ".");
        System.out.println("Bob's Salary is: $" + bobSalary + ".");
        System.out.println("The highest salary is: $" + highestSalary + ".");

        // Question 2:
        System.out.println("\n" + "Question 2:");

        float carPrice = (float) Math.random() * 100000;
        // Rounding carPrice value to two decimal places.
        carPrice = (float) Math.round(carPrice * 100) / 100;
        float truckPrice = (float) Math.random() * 100000;
        // Rounding truckPrice value to two decimal places.
        truckPrice = (float) Math.round(truckPrice * 100) / 100;
        String lowerPrice;

        // Determining higher value with if-else. Could also use "Math.max".
        if (carPrice < truckPrice) {
            lowerPrice = "Car price is lower at $" +carPrice + ". The truck price was $" + truckPrice + ".";
        }
        else {
            lowerPrice = "The truck price is lower at $" + truckPrice + ". The car price was $" + carPrice + ".";
        }

        System.out.println(lowerPrice);

        // Question 3:
        System.out.println("\n" + "Question 3:");

        float radius = 7.25f;
        double area = Math.PI * Math.pow(radius, 2); // Used double to account for unforeseen out-of-bounds issues.

        System.out.println("The radius of the given circle was: " + radius + ". The area is: " + area + ".");

        // Question 4:
        System.out.println("\n" + "Question 4:");

        float exampleVariable = 5.0f;

        System.out.println("The square root of the given variable, " + exampleVariable + " is: "
                + Math.sqrt(exampleVariable) + ".");

        // Question 5:
        System.out.println("\n" + "Question 5:");

        // Initializing first point.
        float[] point1 = new float[2];
        point1[0] = 5; point1[1] = 10;
        // Initializing second point.
        float[] point2 = new float[2];
        point2[0] = 85; point2[1] = 50;

        double distance = Math.sqrt(Math.pow((point2[0] - point1[0]), 2) + Math.pow(point2[1] - point1[1], 2));

        System.out.println("The distance between point 1: (" + point1[0] + ", " + point1[1] + ") and point 2: (" +
                point2[0] + ", " + point2[1] + ") is: " + distance + ".");

        // Question 6:
        System.out.println("\n" + "Question 6:");

        float absoluteValueVariable = -3.8f;
        System.out.println("The absolute value of the given variable, " + absoluteValueVariable + " is: " +
        Math.abs(absoluteValueVariable) + ".");

        // Question 7:
        System.out.println("\n" + "Question 7:");

        System.out.println("Random number between 0 and 1 is:" + Math.random() + ".");
    }
}