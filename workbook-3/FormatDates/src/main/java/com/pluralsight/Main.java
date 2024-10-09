package com.pluralsight;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        DateTimeFormatter fmt0 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(today.format(fmt0));

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm 'in GMT'");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("hh:mm:ss dd-MMM-yyyy");

//        SimpleDateFormat requiredFormat = new SimpleDateFormat("EEEE, MMM d, yyyy HH:mm 'in GMT'");
//        requiredFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
//        System.out.println(requiredFormat.format(LocalDate.now()));

        System.out.println(today.format(fmt1));
        System.out.println(today.format(fmt2));
        System.out.println(today.format(fmt4));
    }
}