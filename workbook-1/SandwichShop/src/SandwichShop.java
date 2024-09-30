import java.util.Scanner;

public class SandwichShop {
    // Static Variables
    static final double REGULAR_PRICE = 5.45;
    static final double LARGE_PRICE = 8.95;
    static final double STUDENT_DISCOUNT = .10;
    static final double SENIOR_DISCOUNT = .20;

    public static void main(String[] args) {
        // Variables
        int sandwich;
        int age;
        Scanner scanner = new Scanner(System.in);
        double totalCost;

        // User Input
        System.out.println("Hello, which Sandwich would you like (1: normal 2: large)?");
        sandwich = scanner.nextInt();

        // Input Validation
        if ( !(sandwich == 1) || !(sandwich == 2)) {
            System.out.println("Process failed. Invalid sandwich size.");
            return;
        }

        System.out.println("How old are you?: ");
        age = scanner.nextInt();

        // Large-Small Sandwich Conditional. 1 - Regular Price. * - Large Price
        totalCost = sandwich == 1 ? REGULAR_PRICE : LARGE_PRICE;

        // Discount Deduction
        if ( age <= 17) {
            totalCost -= STUDENT_DISCOUNT * totalCost;
            System.out.println("You got a student discount!");
        } else if (age >= 65) { totalCost -= SENIOR_DISCOUNT * totalCost;
            System.out.println("You got a senior discount!");
        }

        System.out.println("Your total is: $" + String.format("%.2f", totalCost) +". Have a nice day!");
    }
}