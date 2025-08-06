// src/main/java/com/team1/directory/DirectoryManager.java
package com.team1.directory;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Manages a collection of Business entries loaded from a CSV file.
 */
public class DirectoryManager {

    private final List<Business> businesses = new ArrayList<>();

    /**
     * Thrown when business data is malformed or cannot be loaded.
     */
    public static class BusinessDataException extends Exception {
        public BusinessDataException(String message)        { super(message); }
        public BusinessDataException(String message, Throwable cause) { super(message, cause); }
    }

    /**
     * Loads businesses from a CSV file with header:
     * name,address,phone,hours,website,category,rating
     *
     * @param csvPath path to the CSV file
     * @throws BusinessDataException on parse errors or I/O issues
     */
    public void loadData(String csvPath) throws BusinessDataException {
        try (BufferedReader reader = new BufferedReader(new FileReader(csvPath))) {
            String header = reader.readLine();
            if (header == null
             || !header.equalsIgnoreCase("name,address,phone,hours,website,category,rating")) {
                throw new BusinessDataException("Unexpected CSV header: " + header);
            }

            String line;
            while ((line = reader.readLine()) != null) {
                String[] cols = line.split(",", -1);
                if (cols.length < 7) {
                    // Skip invalid or incomplete rows
                    continue;
                }

                try {
                    double rating = Double.parseDouble(cols[6].trim());
                    Business b = new Business.Builder()
                        .setName(cols[0].trim())
                        .setAddress(cols[1].trim())
                        .setPhone(cols[2].trim())
                        .setHours(cols[3].trim())
                        .setWebsite(cols[4].trim())
                        .setCategory(cols[5].trim())
                        .setRating(rating)
                        .build();
                    businesses.add(b);
                } catch (NumberFormatException e) {
                    // Skip rows where rating isn't a valid number
                }
            }

        } catch (IOException e) {
            throw new BusinessDataException("I/O error loading CSV", e);
        }
    }

    /**
     * Returns all loaded businesses (read-only).
     */
    public List<Business> getAll() {
        return Collections.unmodifiableList(businesses);
    }

    /**
     * Searches businesses whose name contains the keyword (case-insensitive).
     */
    public List<Business> searchByName(String keyword) {
        String kw = keyword.toLowerCase();
        return businesses.stream()
                         .filter(b -> b.getName().toLowerCase().contains(kw))
                         .collect(Collectors.toList());
    }

    /**
     * Filters businesses by exact category match (case-insensitive).
     */
    public List<Business> filterByCategory(String category) {
        String cat = category.toLowerCase();
        return businesses.stream()
                         .filter(b -> b.getCategory().toLowerCase().equals(cat))
                         .collect(Collectors.toList());
    }

    /**
     * Searches businesses by rating given as a String.
     * Parses to a double and delegates to the numeric overload.
     */
    public List<Business> searchByRating(String ratingStr) {
        try {
            double min = Double.parseDouble(ratingStr);
            return searchByRating(min);
        } catch (NumberFormatException e) {
            return Collections.emptyList();
        }
    }

    /**
     * Filters businesses with rating >= minRating.
     */
    public List<Business> searchByRating(double minRating) {
        return businesses.stream()
                         .filter(b -> b.getRating() >= minRating)
                         .collect(Collectors.toList());
    }
}
