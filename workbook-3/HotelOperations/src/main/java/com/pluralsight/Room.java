package com.pluralsight;

public class Room {
    private int beds;
    private int price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    public Room(int beds, int price) {
        this.beds = beds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
        this.isAvailable = !isOccupied & !isDirty;
    }

    public int getBeds() {
        return beds;
    }

    public int getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isDirty & !isOccupied;
    }
}