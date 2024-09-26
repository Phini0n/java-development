package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        char operation;
        String expression;
        Scanner scanner = new Scanner(System.in);

        System.out.print(
                "Possible calculations:\n" +
                        "( A ) dd\n" +
                        "( S ) ubtract\n" +
                        "( M ) ultiply\n" +
                        "( D ) ivide\n" +
                        "Please select an option: "
        );
        operation = scanner.nextLine().charAt(0);

        if (operation == 'A' || operation == 'a') {
            System.out.println("Begin addition.");
            firstNumber = scanner.nextDouble();
            System.out.println(" + ");
            secondNumber = scanner.nextDouble();
            System.out.println( " = " + (firstNumber + secondNumber));
        }
    }
}