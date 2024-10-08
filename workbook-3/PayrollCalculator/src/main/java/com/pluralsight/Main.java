package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try {
            // User input
            System.out.println("Enter the name of the employee file to process: ");
            String fileToProcess = scanner.next();
            System.out.println("Enter the name of the payroll file to create: ");
            String payrollFile = scanner.next();

            // File Reading Process
            FileReader fR = new FileReader("src/" + fileToProcess);
            BufferedReader bufferedReader = new BufferedReader(fR);

            //File Writing Process
            FileWriter fW = new FileWriter(payrollFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fW);

            try {
                String line;
                bufferedWriter.write("id|name|gross pay\n");
                while ((line = bufferedReader.readLine()) != null) {
                    String[] strings = line.split("\\|", 4);
                    Employee employee = new Employee(Long.parseLong(strings[0]), strings[1],
                            Double.parseDouble(strings[2]), Float.parseFloat(strings[3]));
                    bufferedWriter.write(employee.getEmployeeId() + "|" + employee.getName() + "|"
                            + employee.getGrossPay());
                    bufferedWriter.write("\n");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            bufferedWriter.close();
            bufferedReader.close();
            fW.close();
            fR.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            throw new Exception(e);
        }
    }
}