package com.pluralsight;

import com.pluralsight.collection.FixedList;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FixedList<Object> numbers = new FixedList<>(3);

        numbers.add(22.0);
        numbers.add("Two");
        numbers.add(93);
        // numbers.add("Forty-Three"); // This line should fail.

        System.out.println(numbers.getItems().size());

        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        // dates.add(15);
    }

}
