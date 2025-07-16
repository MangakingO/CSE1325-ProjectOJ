// src/main/java/com/yourteam/directory/Main.java
package com.team1.directory;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String CSV_FILE = "businesses.csv";

    public static void main(String[] args) {
        DirectoryManager dm = new DirectoryManager();
        try {
            dm.loadData(CSV_FILE);
        } catch (IOException e) {
            System.err.println("Failed to load data: " + e.getMessage());
            System.exit(1);
        }

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Local Business Directory ---");
            System.out.println("1) List all   2) Search by name   3) Filter by category  4) Filter by rating   0) Exit");
            System.out.print("Choose an option: ");
            String choice = in.nextLine().trim();

            switch (choice) {
                case "1":
                    dm.getAll().forEach(b -> {
                        System.out.println(b);
                        System.out.println();
                    });
                    break;
                case "2":
                    System.out.print("Enter keyword: ");
                    List<Business> byName = dm.searchByName(in.nextLine());
                    byName.forEach(b -> { System.out.println(b + "\n"); });
                    break;
                case "3":
                    System.out.print("Enter category: ");
                    List<Business> byCat = dm.filterByCategory(in.nextLine());
                    byCat.forEach(b -> { System.out.println(b + "\n"); });
                    break;
                case "4":
                    System.out.print("Enter rating (1-5): ");
                    List<Business> byRating = dm.searchByRating(in.nextLine());
                    byRating.forEach(b -> {System.out.println(b + "\n"); });
                    break;
                case "0":
                    System.out.println("Goodbye!");
                    in.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
