// src/main/java/com/yourteam/directory/DirectoryManager.java
package com.team1.directory;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class DirectoryManager {
    private List<Business> businesses = new ArrayList<>();

    /** Load businesses from a CSV file with header:
     *  name,address,phone,hours,website,category
     */
    public void loadData(String csvPath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(csvPath))) {
            String line = reader.readLine(); // skip header
            while ((line = reader.readLine()) != null) {
                String[] cols = line.split(",", -1);
                if (cols.length < 7) continue;
                businesses.add(new Business(
                    cols[0].trim(),
                    cols[1].trim(),
                    cols[2].trim(),
                    cols[3].trim(),
                    cols[4].trim(),
                    cols[5].trim(),
                    cols[6].trim()
                ));
            }
        }
    }

    /** Return all businesses whose name contains the keyword (case-insensitive). */
    public List<Business> searchByName(String keyword) {
        String kw = keyword.toLowerCase();
        return businesses.stream()
            .filter(b -> b.getName().toLowerCase().contains(kw))
            .collect(Collectors.toList());
    }

    /** Return all businesses in the given category (exact match, case-insensitive). */
    public List<Business> filterByCategory(String category) {
        String cat = category.toLowerCase();
        return businesses.stream()
            .filter(b -> b.getCategory().toLowerCase().equals(cat))
            .collect(Collectors.toList());
    }

    /** Simple getter for all loaded entries. */
    public List<Business> getAll() {
        return Collections.unmodifiableList(businesses);
    }

    /** Return all businesses with the givin rating (case-insensitive). */
    public List<Business> searchByRating(String rating){
        return businesses.stream()
            .filter(b-> b.getRating().contains(rating))
            .collect(Collectors.toList());
    }
}
