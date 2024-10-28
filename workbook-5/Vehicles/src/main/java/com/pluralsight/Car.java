package com.pluralsight;

public class Car extends Vehicle{
    private int numberOfDoors;

    public void openTrunk() {
        System.out.println("Opened trunk.");
    }

    public void closeTrunk() {
        System.out.println("Closed trunk.");
    }
}
