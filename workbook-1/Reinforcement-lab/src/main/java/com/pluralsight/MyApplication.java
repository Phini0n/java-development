package com.pluralsight;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        // Variables
        String userName;
        int userAge;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            System.out.println(randomNumber());
        }
        System.out.println();
        System.out.print("Enter your name: ");
        userName = scanner.next();
        System.out.print("Enter your age: ");
        userAge = scanner.nextInt();

        switch (userAge) {
            case 1:
                break;
        }
        Math.random();
        // Methods
        printPersonalMessage(userName, userAge);
        determineVoter(userAge);

        // Alice name check
        if (userName.equals("Alice")) { System.out.println("Welcome back, Alice."); }
        else { System.out.println( "Hello " + userName + "."); }

        //  If Statement Logical Operators
        if (userName.equals("Bob") && userAge >= 21 ) { System.out.println("You are old enough to drink."); }
        else { System.out.println("You are not old enough to drink."); }
    }

    private static int randomNumber() {
        return (int) (Math.random() * 10) + 1;
        // (int)(Math.random() *((max - min) + 1)) + min;
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        int[] holdingArray = new int[a.length];
        return a;
    }

    private static boolean determineVoter(int userAge) {
        if (userAge >= 18) {
            System.out.println("You are old enough to vote.");
            return true;
        } else {
            System.out.println("You are not old enough to vote.");
            return false;
        }
    }

    private static double sqrtNumber(double number) {
        return Math.sqrt(number);
    }

    private static void printPersonalMessage(String userName, int userAge) {
        System.out.println("Your name is " + userName + ", and your age is " + userAge + ".");
    }
}
