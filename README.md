# 📂 CSE1325 Business Directory Project

A Java-based command-line application that allows users to view and search a list of businesses from a CSV file.

---

## 🛠️ Features

- ✅ Load business data from `businesses.csv`
- 🔍 Search by **name**, **city**, or **category**
- 📋 View all business entries
- 🧭 Simple, menu-driven CLI interface

---

## 🧰 Project Structure

CSE1325-ProjectOJ/
├── bin/ # Compiled .class files (ignored in .gitignore)
├── src/
│ └── com/team1/directory/
│ ├── Main.java # Program entry point
│ ├── Business.java # Business model
│ ├── Directory.java # Core logic and search
│ └── ... # Additional helper classes
├── businesses.csv # Business data
└── README.md # Project info and instructions


---

## 🚀 Getting Started

### 1. Clone the Repo

```bash
git clone https://github.com/MangakingO/CSE1325-ProjectOJ.git
cd CSE1325-ProjectOJ

2. Compile the Program

javac -d bin src/com/team1/directory/*.java

3. Run the Program

java -cp bin com.team1.directory.Main

📦 .gitignore Recommendation

To keep your repo clean, add a .gitignore file in the root:

# Ignore compiled files
*.class

# Ignore bin folder contents but keep structure
!bin/
!bin/**/

🤝 Contributing

    Fork the repository

    Create your feature branch

git checkout -b feature/myFeature

Commit your changes

git commit -m "Add feature"

Push to the branch

    git push origin feature/myFeature

    Open a pull request

📄 Disclaimer

This project was created by Oscar Barrios Jimenez and Jose Rojas for educational purposes as part of CSE1325: Object-Oriented Programming at the University of Texas at Arlington (UTA).

All code and assets are original or adapted under academic fair use. Redistribution, reproduction, or reuse of this codebase without explicit permission is strictly prohibited.

© 2025 Oscar Barrios Jimenez & Jose Rojas. All rights reserved.
