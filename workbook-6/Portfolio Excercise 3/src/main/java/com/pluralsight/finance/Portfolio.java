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
        this.assets.add(asset);

    }

    public double getValue(double value) {
        double total = 0;
        for (IValuable valuable : this.assets) {
            total += valuable.getValue();
        }
        return total;
    }

    public IValuable getMostValuable() {
        if (assets.isEmpty()) {
            return null;
        }

        IValuable mostValuableAsset = assets.get(0);
        double highest = mostValuableAsset.getValue();

        for (IValuable valuable : this.assets) {
            double assetValue = valuable.getValue();
            if (assetValue > highest) {
                highest = assetValue;
                mostValuableAsset = valuable;
            }
        }
        return mostValuableAsset;
    }

    public IValuable getLeastValuable() {
        if (assets.isEmpty()) {
            return null;
        }

        IValuable leastValuableAsset = assets.get(0);
        double lowest = leastValuableAsset.getValue();

        for (IValuable valuable : this.assets) {
            double assetValue = valuable.getValue();
            if (assetValue < lowest) {
                lowest = assetValue;
                leastValuableAsset = valuable;
            }
        }
        return leastValuableAsset;
    }
}
