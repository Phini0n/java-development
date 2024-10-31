package com.pluralsight.finance;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        IValuable account2 = new BankAccount("Gary", "456", 1500);
        FixedAsset asset = new Gold("Ring", 20000, 20);
        Gold gold = new Gold("Ring", 240, 1);

        account1.deposit(100);
        // account2.deposit(100); Does not work
        ((BankAccount) account2).deposit(100);
    }
}