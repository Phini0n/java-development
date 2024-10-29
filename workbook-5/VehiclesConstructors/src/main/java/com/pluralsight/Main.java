package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped("Ford", "blue", 10, 10,
                10, 10 ,10);
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        SemiTruck semiTruck = new SemiTruck("Ford", "blue", 10, 10,
                10, 10 ,10);
        semiTruck.setNumberOfTrailers(2);
        semiTruck.setFuelCapacity(100);

        HoverCraft hoverCraft = new HoverCraft("Ford", "blue", 10, 10,
                10, 10 ,10);
        hoverCraft.setAirCushionPressure(50);
        hoverCraft.setColor("Blue");

        Car car = new Car("Ford", "blue", 10, 10,
                10, 10 ,10);
        car.setNumberOfDoors(4);
        car.setTopSpeed(200);

        // Test the functionality of the classes and methods
        slowRide.ride();
        semiTruck.loadCargo();
        hoverCraft.hover();
        car.openTrunk();

        // Accessing Vehicle getters
        System.out.println("Color of the Moped: " + slowRide.getColor());
        System.out.println("Fuel capacity of the SemiTruck: " + semiTruck.getFuelCapacity());
        System.out.println("Air cushion pressure of the HoverCraft: " + hoverCraft.getAirCushionPressure());
        System.out.println("Top speed of the Car: " + car.getTopSpeed());
    }
}
