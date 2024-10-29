package com.pluralsight;

public class Hover extends Vehicle{
    private int airCushionPressure;

    public Hover(String model, String color, int topSpeed, int fuelCapacity, int numberOfPassengers, int cargoCapacity, int airCushionPressure) {
        super(model, color, topSpeed, fuelCapacity, numberOfPassengers, cargoCapacity);
        this.airCushionPressure = airCushionPressure;
    }

    private void hover() {
        System.out.println("Hovering.");
    }
}