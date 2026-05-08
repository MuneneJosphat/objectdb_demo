
# ObjectDB Demo Demo

## Overview

This repository contains a simple Java Maven demo application that uses ObjectDB and JPA to persist a `Student` entity.

The demo creates a `Student`, saves it to an ObjectDB database file, and then reads it back by ID.

## Prerequisites

- Java JDK 8 or newer installed and available on `PATH`
- Apache Maven installed and available on `PATH`
- Git installed for cloning the repository

## Clone the repository

1. Open a terminal or command prompt.
2. Run the clone command:

```bash
git clone <repository-url>
```

3. Change into the repository folder:

```bash
cd advanced_data_models_demo
```

## Build and run the demo

The runnable Maven project is located in the `objectdb-demo` subfolder.

1. Change into the project directory:

```bash
cd objectdb-demo
```

2. Build and run the application with Maven:

```bash
mvn clean compile exec:java
```

If Maven is configured correctly, the application will start and display the retrieved `Student` object.

## Expected output

On success, you should see output similar to:

```text
Retrieved object: Student{id=1, name='Amina', course='BCT', year=3}
```

The exact `id` value may differ if the database file already exists.

## Project structure

```text
objectdb-demo/
├── pom.xml
├── db/
│   └── students.odb
├── src/
│   └── main/
│       ├── java/
│       │   └── demo/
│       │       ├── Main.java
│       │       └── Student.java
│       └── resources/
│           └── META-INF/
│               └── persistence.xml
```

## Important files

- `pom.xml` — Maven configuration and dependencies
- `src/main/java/demo/Main.java` — application entry point
- `src/main/java/demo/Student.java` — JPA entity class
- `src/main/resources/META-INF/persistence.xml` — persistence configuration
- `db/students.odb` — ObjectDB database file (created automatically when the app runs)

## Notes

- If the database file does not exist, the application will create it automatically.
- If you prefer, you can open `objectdb-demo` in an IDE such as IntelliJ IDEA or VS Code and run `demo.Main` directly.
- Use `mvn clean compile exec:java` from the `objectdb-demo` directory to rebuild and run the demo.

## Troubleshooting

- Verify `java -version` and `mvn -version` return valid versions.
- If Maven cannot download dependencies, check your internet connection.
- If the project does not run, ensure you are inside the `objectdb-demo` folder before executing Maven commands.

