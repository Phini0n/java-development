package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SearchEngineLogger {

    private static final String LOG_FILE_NAME = "logs.txt";
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        logAction("launch");

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter a search term (X to exit): ");
            String searchTerm = scanner.nextLine();

            if("X".equalsIgnoreCase(searchTerm)) {
                logAction("exit");
                break;
            } else {
                logAction("search: " + searchTerm);
            }
        }
        scanner.close();
    }

    private static void logAction(String action) {

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/" + LOG_FILE_NAME,
                    true));
            bufferedWriter.write(FORMATTER.format(LocalDateTime.now()) + " " + action);
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch(Exception ex) {
            System.err.println("Error writing to the log file: " + ex.getMessage());
        }
    }
}