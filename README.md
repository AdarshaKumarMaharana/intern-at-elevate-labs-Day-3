# 📚 Library Management System (OOP in Java)

This is a simple **Library Management System** built using **Object-Oriented Programming (OOP)** concepts in Java. It allows users to manage books by issuing and returning them. The project demonstrates core OOP principles like **Abstraction, Inheritance, Encapsulation**, and **Polymorphism**.

---

## 🛠️ Tools Used

- Java
- VS Code
- Terminal / Command Line

---

## 🧱 Classes Used

### 1. `Book`
Represents a book in the library.

- Fields: `title`, `author`, `isIssued`
- Methods: `issue()`, `returnBook()`, `toString()`

### 2. `User`
Represents a user of the library.

- Fields: `id`, `name`
- Methods: `toString()`

### 3. `Library`
Manages the collection of books.

- Methods:
  - `addBook(Book book)`
  - `showAllBooks()`
  - `issueBook(String title)`
  - `returnBook(String title)`

### 4. `Main`
Contains the `main()` method to run the program with a menu-driven interface.

---

## ✅ Features

- Add sample books to the library
- Display list of available and issued books
- Issue a book if available
- Return a book that was issued
- Simple command-line based UI

---

## 🔁 How to Run

1. Clone the repository or download the code.
2. Open the folder in **VS Code**.
3. Compile the files:
   ```bash
   javac *.java

