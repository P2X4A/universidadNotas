# Student Grade Registry - universidadNotas

## Description

Student grade registry with queries and file persistence. The model stores the grades of each student and the data layer uses the **DAO** pattern with DTOs and a `DataMapper`; the interface runs on the console with **MVC** separation.

Academic project developed for the **Java programming** courses - Systems Engineering, Universidad El Bosque.

## Author

- Sergio Alejandro Parra Rivera

## Technologies

- Java 21 (compiled with `maven-compiler-plugin`)
- Maven 3.8+ with `exec-maven-plugin` to run the application
- **MVC** architecture (`controller`, `model`, `view`)
- **DAO** and **DTO** patterns with a `DataMapper` for file persistence

## Requirements

| Requirement | Version | How to check |
| --- | --- | --- |
| JDK | 21 or higher | `javac -version` |
| Maven | 3.8 or higher | `mvn -v` |
| Git | Any recent version | `git --version` |

## Installation

Follow these steps exactly so the application runs on the first try.

### 1. Clone the repository

```bash
git clone https://github.com/P2X4A/universidadNotas.git
```

### 2. Enter the project folder

```bash
cd universidadNotas
```

> On Windows, if your path contains spaces, always quote it, for example: `cd "C:\Users\Example\Documents\universidadNotas"`.

### 3. Verify your environment

```bash
javac -version
mvn -v
```

Expected: JDK 21 (or higher) and Maven 3.8 (or higher). If any command fails, install or update that tool before continuing.

### 4. Compile the project

```bash
mvn clean compile
```

What success looks like:

- The console ends with `BUILD SUCCESS`.
- A `target/classes/` folder is created with the compiled classes.

## Running the application

```bash
mvn exec:java
```

The menu is displayed in the terminal: register grades per student and consult the recorded academic records.

Troubleshooting:

- `ClassNotFoundException` or missing main class: compile first with `mvn clean compile`.
- `UnsupportedClassVersionError`: your JDK is older than 21; install JDK 21 or higher and check it with `javac -version`.

## Main features

- **Grade registry:** record the grades of each student (`NotaEstudiante`).
- **Platform model:** `Brighstpace` centralizes the academic records of the system.
- **Queries:** consult the grades of a student from the console menu.
- **Persistence:** grades survive between executions through the DAO layer (`NotaEstudianteDAOImpl`, `NotaEstudianteDTO`, `DataMapper`, `FileHandler`).
- **Console MVC:** `Controlador` coordinates, the `model` package holds the data and `Consola` renders the menu.

## Project structure

```text
universidadNotas/
├── pom.xml
├── README.md
├── LICENSE
└── src/
    └── co/edu/unbosque/
        ├── controller/
        │   ├── AplMain.java               # Entry point (main class)
        │   └── Controlador.java           # Application controller (MVC)
        ├── model/
        │   ├── Brighstpace.java           # Academic platform model
        │   ├── NotaEstudiante.java        # Student grade entity
        │   └── persistence/
        │       ├── IDAO.java              # Data access interface
        │       ├── NotaEstudianteDAOImpl.java
        │       ├── NotaEstudianteDTO.java # Grade record (DTO)
        │       ├── DataMapper.java        # Domain object <-> DTO mapping
        │       └── FileHandler.java       # File reading and writing
        └── view/
            └── Consola.java               # Console interface
```
