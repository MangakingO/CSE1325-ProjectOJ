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
├── src/
│ └── main/
│ ├── java/
│ │ └── com/team1/directory/
│ │ ├── Business.java
│ │ ├── DirectoryManager.java
│ │ └── Main.java
│ └── resources/
│ └── businesses.csv
│
├── docs/
│ ├── UML_Class_Diagram.png # PlantUML-generated class diagram
│ ├── Architecture_Diagram.png # MVC overview diagram
│ └── directory_diagram.puml # PlantUML source
│
├── screenshots/
│ ├── Category.png
│ ├── Listall.png
| ├── Menu.png
| ├── Rating.png
│ └── Searchname.png
│
├── README.md



```



## 🖼️ Screenshots of Directory Functionality

### Menu
![Menu](screenshots/Menu.PNG)

### List All
![List All](screenshots/Listall.PNG)

### Search by Name
![Search by Name](screenshots/Searchname.PNG)

### Filter by Category
![Filter by Category](screenshots/Category.PNG)

### Filter by Rating
![Filter by Rating](screenshots/Rating.PNG)

📄 Disclaimer

This project was created by Oscar Barrios Jimenez and Jose Rojas for educational purposes as part of CSE1325 at the University of Texas at Arlington (UTA).

All code and assets are original or adapted under academic fair use. Redistribution or reuse without explicit permission is prohibited.

© 2025 Oscar Barrios Jimenez & Jose Rojas. All rights reserved.
