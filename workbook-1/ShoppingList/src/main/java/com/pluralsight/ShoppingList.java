package com.pluralsight;

public class ShoppingList {
    public static void main(String[] args) {
        String shoppingList = "Apple,Banana,Chocolate,Ground Beef,Cookies," +
                              "Juice,Strawberries,Bread,Eggs,Lunch Meat";
        String[] shoppingItems = shoppingList.split(",");

        for (String shoppingItem : shoppingItems) { System.out.println(shoppingItem); }
    }
}

public static void main(String[] args) {
    
}