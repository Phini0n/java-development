package com.pluralsight;

public class Vehicle {
    protected String model;
    protected String color;
    protected int topSpeed;
    protected int fuelCapacity;
    protected int numberOfPassengers;
    protected int cargoCapacity;

    private void startEngine() {
        System.out.println("Engine started.");
    }

    private void stopEngine() {
        System.out.println("Engine stopped.");
    }

    private void accelerate() {
        System.out.println("Accelerating");
    }

    private void brake() {
        System.out.println("Braking");
    }
}
