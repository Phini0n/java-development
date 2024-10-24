package com.pluralsight;

import java.util.Arrays;

public class NameFormatter {
    private NameFormatter() {}

    public static String format(String firstName, String lastName) {
        return format(firstName + " " + lastName);
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        return prefix + " " + firstName + " " + middleName + " " + lastName + ", " + suffix;
    }

    public static String format(String fullName) {
        StringBuilder sb = new StringBuilder();
        String[] names = fullName.split(" ");

        for (String name : names) {
            sb.append(name + " ");
        }

        return sb.toString();
    }
}
