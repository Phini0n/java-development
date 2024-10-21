package com.pluralsight;

public class Room {
    private int beds;
    private int price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    public Room(int beds, int price, boolean isOccupied, boolean isDirty, boolean isAvailable) {
        this.beds = beds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
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
        return isAvailable;
    }
}