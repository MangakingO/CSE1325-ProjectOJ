// src/main/java/com/team1/directory/Main.java
package com.team1.directory;


import java.util.List;
import java.util.Scanner;

/**
 * CLI entry point for the Local Business Directory application.
 */
public class Main {

    private static final String CSV_FILE = "businesses.csv";

    public static void main(String[] args) {
        DirectoryManager dm = new DirectoryManager();
        try {
            dm.loadData(CSV_FILE);
        } catch (DirectoryManager.BusinessDataException e) {
            System.err.println("Error loading businesses: " + e.getMessage());
            System.exit(1);
        }

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Local Business Directory ---");
            System.out.println("1) List all");
            System.out.println("2) Search by name");
            System.out.println("3) Filter by category");
            System.out.println("4) Filter by minimum rating");
            System.out.println("0) Exit");
            System.out.print("Choose an option: ");

            String choice = in.nextLine().trim();
            switch (choice) {
                case "1":
                    dm.getAll().forEach(b -> System.out.println(b + "\n"));
                    break;
                case "2":
                    System.out.print("Enter name keyword: ");
                    List<Business> byName = dm.searchByName(in.nextLine());
                    byName.forEach(b -> System.out.println(b + "\n"));
                    break;
                case "3":
                    System.out.print("Enter category: ");
                    List<Business> byCat = dm.filterByCategory(in.nextLine());
                    byCat.forEach(b -> System.out.println(b + "\n"));
                    break;
                case "4":
                    System.out.print("Enter minimum rating (e.g., 4.0): ");
                    List<Business> byRating = dm.searchByRating(in.nextLine());
                    byRating.forEach(b -> System.out.println(b + "\n"));
                    break;
                case "0":
                    System.out.println("Goodbye!");
                    in.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
