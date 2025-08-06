# 📂 CSE1325 Business Directory Project

A Java-based command-line application that allows users to view and search a list of businesses from a CSV file.

---
## 📝 Project Overview

This application was developed for **CSE1325: Object-Oriented Programming** at UTA to demonstrate core OOP concepts in Java:

- **`Business` class** encapsulates each business’s data (name, address, phone, hours, website, category, rating).  
- **`Directory` class** manages a collection of `Business` objects: loading from CSV, storing in a list, and providing search/filter methods.  
- **`Main` class** provides a menu-driven CLI for user interaction.  

Key learning outcomes:
- **Encapsulation & Classes**: Fields, constructors, getters/setters  
- **File I/O**: Parsing `businesses.csv` into objects  
- **Collections & Iteration**: Storing and traversing lists of objects  
- **Modularity**: Separating data model, business logic, and UI  
- **User Interaction**: CLI that lists all entries, searches by name, filters by category or rating, and exits cleanly

  
## 🛠️ Features

- ✅ Load business data from `businesses.csv`  
- 🔍 Search by **name**, **city**, **category**, or **rating**  
- 📋 View all business entries  
- 🧭 Simple, menu-driven CLI interface  

---


## 🧰 Project Structure

```plaintext
CSE1325-ProjectOJ/
├── bin/                      # Compiled .class files (ignored by .gitignore)
├── src/
│   └── com/team1/directory/
│       ├── Main.java         # Program entry point
│       ├── Business.java     # Business model
│       ├── Directory.java    # Core logic and search
│       └── …                 # Additional helper classes
├── businesses.csv            # Business data
├── images/                   # Screenshots folder
│   ├── Menu.PNG
│   ├── Listall.PNG
│   ├── Searchname.PNG
│   ├── Category.PNG
│   └── Rating.PNG
└── README.md                 # This file



```



## 🖼️ Screenshots of Directory Functionality

### Menu
![Menu](images/Menu.PNG)

### List All
![List All](images/Listall.PNG)

### Search by Name
![Search by Name](images/Searchname.PNG)

### Filter by Category
![Filter by Category](https://github.com/MangakingO/CSE1325-ProjectOJ/blob/main/images/Category.PNG)

### Filter by Rating
![Filter by Rating](images/Rating.PNG)

📄 Disclaimer

This project was created by Oscar Barrios Jimenez and Jose Rojas for educational purposes as part of CSE1325 at the University of Texas at Arlington (UTA).

All code and assets are original or adapted under academic fair use. Redistribution or reuse without explicit permission is prohibited.

© 2025 Oscar Barrios Jimenez & Jose Rojas. All rights reserved.
