package com.pluralsight.finance;

import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<IValuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public void add(IValuable asset) {


    }

    public double getValue(double value) {
        double total = 0;
        for (IValuable valuable : this.assets) {
            total += valuable.getValue();
        }
        return total;
    }

    public IValuable getMostValuable() {
        double highest = 0;
        IValuable mostValuable = null;
        for (IValuable valuable : this.assets) {
            if (highest < valuable.getValue()) {
                highest = valuable.getValue();
                mostValuable = valuable;
            }
        }
        return mostValuable;
    }

    public IValuable getLeastValuable() {
        double lowest = 0;
        IValuable leastValuable = null;
        for (IValuable valuable : this.assets) {
            if (lowest > valuable.getValue()) {
                lowest = valuable.getValue();
                leastValuable = valuable;
            }
        }
        return leastValuable;
    }
}
