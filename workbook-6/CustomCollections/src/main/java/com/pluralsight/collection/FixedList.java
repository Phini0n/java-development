package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private final int maxSize;

    private List<T> items;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<T>(maxSize);
    }

    public void add(T item) {
        if (this.items.size() != maxSize) {
            items.add(item);
        }
        else {
            System.out.println("Maximum size reached.");
        }
    }

    public List<T> getItems() {
        return items;
    }
}
