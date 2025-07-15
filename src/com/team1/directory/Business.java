// src/main/java/com/yourteam/directory/Business.java
package com.team1.directory;

public class Business {
    private String name;
    private String address;
    private String phone;
    private String hours;
    private String website;
    private String category;

    public Business(String name, String address, String phone,
                    String hours, String website, String category) {
        this.name     = name;
        this.address  = address;
        this.phone    = phone;
        this.hours    = hours;
        this.website  = website;
        this.category = category;
    }

    // Getters
    public String getName()     { return name; }
    public String getAddress()  { return address; }
    public String getPhone()    { return phone; }
    public String getHours()    { return hours; }
    public String getWebsite()  { return website; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        return String.format(
            "%s (%s)\n  Address: %s\n  Phone: %s\n  Hours: %s\n  Website: %s",
            name, category, address, phone, hours, website);
    }
}
