// src/main/java/com/team1/directory/Business.java
package com.team1.directory;


/**
 * Represents a local business entity.
 * Encapsulates business properties such as name, address, contact info, category, and rating.
 */
public class Business {
    private final String name;
    private final String address;
    private final String phone;
    private final String hours;
    private final String website;
    private final String category;
    private final double rating;

    /**
     * Constructs a Business with all fields.
     *
     * @param name     the business name
     * @param address  the business address
     * @param phone    the contact phone number
     * @param hours    the operating hours
     * @param website  the business website URL
     * @param category the business category
     * @param rating   the business rating (e.g., 4.5)
     */
    public Business(String name,
                    String address,
                    String phone,
                    String hours,
                    String website,
                    String category,
                    double rating) {
        this.name     = name;
        this.address  = address;
        this.phone    = phone;
        this.hours    = hours;
        this.website  = website;
        this.category = category;
        this.rating   = rating;
    }

    // ─── Getters ───────────────────────────────────────────────────────────────

    public String getName()     { return name;    }
    public String getAddress()  { return address; }
    public String getPhone()    { return phone;   }
    public String getHours()    { return hours;   }
    public String getWebsite()  { return website; }
    public String getCategory() { return category;}
    public double getRating()   { return rating;  }

    @Override
    public String toString() {
        // Display rating with one decimal place
        return String.format(
            "%s (%s)%n  Address: %s%n  Phone: %s%n  Hours: %s%n  Website: %s%n  Rating: %.1f",
            name, category, address, phone, hours, website, rating
        );
    }

    // ─── Builder ───────────────────────────────────────────────────────────────

    /**
     * Builder for Business to simplify object construction.
     */
    public static class Builder {
        private String name;
        private String address;
        private String phone;
        private String hours;
        private String website;
        private String category;
        private double rating;

        public Builder setName(String name)         { this.name     = name;     return this; }
        public Builder setAddress(String address)   { this.address  = address;  return this; }
        public Builder setPhone(String phone)       { this.phone    = phone;    return this; }
        public Builder setHours(String hours)       { this.hours    = hours;    return this; }
        public Builder setWebsite(String website)   { this.website  = website;  return this; }
        public Builder setCategory(String category) { this.category = category; return this; }
        public Builder setRating(double rating)     { this.rating   = rating;   return this; }

        /**
         * Builds the Business instance after setting all required fields.
         *
         * @return a new Business
         */
        public Business build() {
            return new Business(name, address, phone, hours, website, category, rating);
        }
    }
}
