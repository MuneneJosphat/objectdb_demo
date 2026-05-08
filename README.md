
# ObjectDB Demo Project

# Overview

This project is a simple Java Maven application that demonstrates an object-oriented database using ObjectDB and JPA. It stores a Student object in the database and retrieves it back to show how persistent object storage works in practice. 

# The project uses:
-Java
-Maven
-ObjectDB
-JPA annotations
-A Student entity class
=A Main class for running the demo

# Project Structure
objectdb-demo/
├── pom.xml
├── src/
│   └── main/
│       ├── java/
│       │   └── demo/
│       │       ├── Main.java
│       │       └── Student.java
│       └── resources/
│           └── META-INF/
│               └── persistence.xml

# File Roles
-pom.xml — manages dependencies and build configuration.
-Student.java — defines the persistent entity.
-Main.java — performs the save and retrieve operations.
-persistence.xml — configures the persistence unit and database connection.

# What the Program Does
The program creates a Student object, saves it into an ObjectDB database file, and then retrieves the same object using its ID. This demonstrates the basic CRUD flow, especially Create and Read operations.

# Expected output:
Retrieved object: Student{id=(any), name='Amina', course='BCT', year=3}

# Requirements
Before running the project, make sure the following are installed:
-Java JDK 8 or newer
-Maven
-A code editor or IDE such as VS Code or IntelliJ IDEA

# How to Run
Run from terminal

Open the project folder in terminal and run:
mvn clean, mvn compile and mvn exec:java -Dexec.mainClass=demo.Main

This command will:
-clean previous builds,
-compile the project,
and run the demo.Main class.

