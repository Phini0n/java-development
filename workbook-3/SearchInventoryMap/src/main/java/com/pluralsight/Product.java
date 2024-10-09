package com.pluralsight;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("id: %d %s - Price: $%.2f", this.getId(), this.getName(), this.getPrice());
//        return System.out.printf("id: %d %s - Price: $%.2f",
//                this.getId(), this.getName(), this.getPrice()).toString();
    }
}
