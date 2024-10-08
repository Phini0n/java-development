package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src/employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            try {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] strings = line.split("\\|", 4);
                    Employee employee = new Employee(Long.parseLong(strings[0]), strings[1],
                            Double.parseDouble(strings[2]), Float.parseFloat(strings[3]));
                    System.out.printf(employee.getEmployeeId() + " " + employee.getName() + " "
                            + employee.getGrossPay());
                    System.out.println();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            throw new RuntimeException(e);
        }
    }
}