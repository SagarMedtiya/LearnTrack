This is a **Java console-based Student Course Management System** developed using core Java and OOP principles.

The application allows users to:

*   Add students
    
*   View students
    
*   Add courses
    
*   Enroll students into courses
    
*   Validate inputs using custom exceptions
    
*   Manage entities using service classes
    

The project demonstrates strong usage of:

*   **OOP concepts** (inheritance, encapsulation, polymorphism)
    
*   **Collections framework** (`ArrayList`)
    
*   **Custom exceptions**
    
*   **Static ID generators**
    
*   **Layered design** (model → service → main)
    

### Key Design

*   `Person` is a base class
    
*   `Student` extends `Person` (inheritance)
    
*   Services manage business logic
    
*   `IdGenerator` uses static counters
    
*   Custom `InvalidInputException` for validation
    

This project simulates a basic backend system structure and follows clean coding practices suitable for learning and interviews.

* * *

# 🛠 Requirements

*   Java 17+ (or Java 11+)
    
*   Command prompt / terminal
    
*   No external libraries required

# How to Compile and Run

## Step 1: Open terminal

Navigate to project folder:

`cd path/to/project`
## Step 2: Compile

# 

If all files are in packages:

`javac -d . src/**/*.java`
## Step 3: Run

## 

`java Main`
