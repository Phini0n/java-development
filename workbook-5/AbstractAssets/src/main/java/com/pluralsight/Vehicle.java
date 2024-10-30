package com.pluralsight;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public double getValue() {
        if (this.year >= 0 && this.year <= 3  ) {
            this.description = "3% reduced value of cost per year";
            return this.originalCost - (this.originalCost * 0.3);
        } else if (this.year >= 4 && this.year <= 6) {
            this.description = "6% reduced value of cost per year";
            return this.originalCost - (this.originalCost * 0.6);
        } else if (this.year >= 7 && this.year <= 10) {
            this.description = "8% reduced value of cost per year";
            return this.originalCost - (this.originalCost * 0.8);
        } else if (this.year > 10) {
            this.description = "Value reduced by $1000.00";
            return this.originalCost - (this.originalCost * 0.25);
        }
        return this.originalCost;
    }
}
