package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private List<T> items;
    private final int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<T>(maxSize);
    }

    public void add(T item) {
        if (this.items.size() < maxSize) {
            items.add(item);
        }
        else {
            throw new IllegalStateException("Maximum size exceeded");
        }
    }

    public List<T> getItems() {
        return items;
    }
}
