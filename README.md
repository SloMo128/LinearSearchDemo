# LinearSearchDemo 🔍

A simple and beginner-friendly Java project that demonstrates the **Linear Search** algorithm.

This project allows the user to search for a number inside an integer array using a linear search approach.  
The program generates a random array, prints it, and lets the user search for values interactively.

---

## 📂 Project Structure
```
LinearSearchDemo/
│
├── LinearSearch.java
├── LinearSearchDemo.java
└── README.md
```

---

## ✨ Features

- Implements the **Linear Search** algorithm
- Searches for a value inside an integer array
- Generates a random array for testing
- Interactive user input using `Scanner`
- Prints whether the value is found and its position
- Clean and beginner-friendly code

---

## 🧠 Algorithm Overview

**Linear Search** works by checking each element of the array one by one until the target value is found or the end of the array is reached.

### Steps:
1. Start from the first element of the array
2. Compare each element with the target value
3. If a match is found, return its index
4. If the value is not found, return `-1`

---

## 🧩 How the Program Works

1. A random integer array is generated
2. The array is printed to the console
3. The user is asked to enter a number to search for
4. The `search()` method is called
5. The program:
   - Displays the index if the value is found
   - Displays a message if the value is not found
6. The program continues until the user enters `-1`

---

## ▶ Example Output
```
[56, 15, 52, 39, 54, 12, 11, 32, 28, 83, 78, 21, 88, 88, 12, 78, 18, 74, 28, 17]
Enter number to search for (-1 to quit): 32
Found at position: 7
Enter number to search for (-1 to quit): 99
Value not found.
Enter number to search for (-1 to quit): -1
```

---

## 🎯 Learning Goals

This project is designed for beginners who want to practice:

- Java arrays
- Loops (`for`, `while`)
- Conditional statements
- User input handling with `Scanner`
- Static utility methods
- Basic search algorithms

---

## ⏱ Time and Space Complexity

| Complexity | Value |
|-----------|-------|
| Time      | O(n) |
| Space     | O(1) |

---

## 🚀 How to Run

1. Make sure you have **Java 8 or higher** installed.  
2. Compile the files:
   ```
   javac LinearSearch.java LinearSearchDemo.java
   ```
3. Run the program:
   ```
   java LinearSearchDemo
   ```
