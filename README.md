# 📂 CSE1325 Business Directory Project

A Java-based command-line application that allows users to view and search a list of businesses from a CSV file.

---

## 📝 Project Overview

This application was developed for **CSE1325: Object-Oriented Programming** at UTA to demonstrate core OOP concepts in Java:

- **`Business.java`**  
  Encapsulates each business’s data (`name`, `address`, `phone`, `hours`, `website`, `category`, `double rating`) and uses a **Builder** pattern (`Business.Builder`) to simplify construction.
- **`DirectoryManager.java`**  
  Manages a collection of `Business` objects:  
  - **Header validation**: verifies `businesses.csv` header exactly matches  
    `name,address,phone,hours,website,category,rating` and throws a custom  
    `BusinessDataException` on mismatch or I/O errors.  
  - **Overloaded methods**:  
    - `searchByRating(String)` parses the input and delegates  
    - `searchByRating(double)` filters by numeric threshold (`rating >= min`)  
  - Provides `searchByName(String)` and `filterByCategory(String)` (exact, case-insensitive).
- **`Main.java`**  
  Menu-driven CLI that lets users:  
  1. List all businesses  
  2. Search by name keyword  
  3. Filter by category  
  4. Filter by minimum rating  
  0. Exit cleanly, with user-friendly error messages on CSV load failures.

**Key learning outcomes** include encapsulation, exception handling, method overloading, file I/O, Java streams, and modular design.

---

## 🛠️ Features

- ✅ **CSV loading & validation** (`businesses.csv`) with clear error reporting  
- 🏗️ **Builder pattern** for `Business` objects to avoid error-prone constructors  
- 🔍 **Search by name** (case-insensitive keyword match)  
- 📋 **List all** business entries  
- 🗂️ **Filter by category** (exact match, case-insensitive)  
- ⭐ **Filter by minimum rating** (≥ threshold) via two overloads (`String` & `double`)  
- ⚙️ **Graceful exception handling** in the CLI loop  

---

## 🧰 Project Structure

```plaintext
CSE1325-ProjectOJ/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/team1/directory/
│       │       ├── Business.java
│       │       ├── DirectoryManager.java
│       │       └── Main.java
│       └── resources/
│           └── businesses.csv
│
├── docs/
│   ├── UML_Class_Diagram.png     # PlantUML-generated class diagram
│   ├── Architecture_Diagram.png  # MVC overview diagram
│   └── directory_diagram.puml    # PlantUML source
│
├── screenshots/
│   ├── Category.png
│   ├── Listall.png
│   ├── Menu.png
│   ├── Rating.png
│   └── Searchname.png
│
├── README.md
└── LICENSE
```

🖼️ Screenshots of Directory Functionality
Menu

Menu
List All

List All
Search by Name

Search by Name
Filter by Category

Filter by Category
Filter by Rating

Filter by Rating

📄 Disclaimer
This project was created by Oscar Barrios Jimenez and Jose Rojas for educational purposes as part of CSE1325 at the University of Texas at Arlington (UTA).
All code and assets are original or adapted under academic fair use. Redistribution or reuse without explicit permission is prohibited.

© 2025 Oscar Barrios Jimenez & Jose Rojas. All rights reserved.
