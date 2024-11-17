# **Hop Step Game Project**

This project implements a Java-based game called "Hop Step Game" and provides a Python script to automate the testing of its functionality. The game involves navigating a sequence of squares while following specific rules to achieve a successful outcome.

---

## **Project Structure**

### **Java Files**
- **`HopStepGame.java`**
  - Core class that implements the game logic.
  - Handles the rules for navigating the squares, determining valid moves, and checking for successful outcomes.

- **`HopStepGameDriver.java`**
  - Main driver program for running the game.
  - Interfaces with the `HopStepGame` class to process inputs and display results.

### **Python Files**
- **`p4testscript.py`**
  - Automated test script written in Python.
  - Executes test cases to validate the correctness of the Java program's logic.

### **Sample Solution**
- **`samplesolutionp4.txt`**
  - Contains the expected results for predefined test cases.
  - Demonstrates that the game passes all tests for different scenarios.

---

## **Getting Started**

### **Prerequisites**
- Java Development Kit (JDK) 8 or later.
- Python 3.x.
- A text editor or IDE for Java development (e.g., IntelliJ IDEA, Eclipse).
- Python package manager (`pip`) for running the test script.

### **Setup**
1. Clone or download this repository.
2. Place the Java files (`HopStepGame.java` and `HopStepGameDriver.java`) into a project folder in your Java IDE.
3. Ensure the Python script (`p4testscript.py`) and sample solution (`samplesolutionp4.txt`) are in the same directory.

---

## **Usage**

### **Running the Game**
1. Compile the Java files:
   ```bash
   javac HopStepGame.java HopStepGameDriver.java
