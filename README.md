CSE1325 Project: Business Directory Search

This Java project reads a list of businesses from businesses.csv and provides a menu-driven interface to search and filter business entries based on criteria such as name, city, and category.

Prerequisites

Java Development Kit (JDK) 8 or higher

Git (optional, for cloning the repo)

Project Structure

CSE1325-ProjectOJ/
├── bin/                    # Compiled classes (should be ignored via .gitignore)
├── src/
│   └── com/team1/directory/
│       ├── Main.java       # Entry point
│       ├── Business.java   # Business model
│       ├── Directory.java  # Directory operations
│       └── ...             # Other source files
├── businesses.csv          # Data file with business records
└── README.md               # This file

Getting Started

Clone the repository

git clone https://github.com/MangakingO/CSE1325-ProjectOJ.git
cd CSE1325-ProjectOJ

Set up a .gitignore to exclude compiled classes and IDE files:

/bin/
*.class

Compilation

Compile the Java source files and place the class files into the bin/ directory:

javac -d bin src/com/team1/directory/*.java

Running the Application

Run the Main class from the bin/ directory:

java -cp bin com.team1.directory.Main

The application will present a menu to:

List all businesses

Search by name, city, or category

Exit the program
