package com.library.management;

import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void registerUser(User user) {
        users.add(user);
        System.out.println("User registered successfully.");
    }

    public void issueBook(String title, int userId) {
        Book foundBook = findBookByTitle(title);
        User foundUser = findUserById(userId);

        if (foundBook == null || foundUser == null) {
            System.out.println("Book or User not found.");
            return;
        }

        if (foundBook.isIssued()) {
            System.out.println("Book is already issued.");
        } else {
            foundBook.issue();
            System.out.println("Book issued to " + foundUser.getName());
        }
    }

    public void returnBook(String title) {
        Book foundBook = findBookByTitle(title);
        if (foundBook == null) {
            System.out.println("Book not found.");
            return;
        }

        if (!foundBook.isIssued()) {
            System.out.println("Book was not issued.");
        } else {
            foundBook.returnBook();
            System.out.println("Book returned successfully.");
        }
    }

    private Book findBookByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) return b;
        }
        return null;
    }

    private User findUserById(int userId) {
        for (User u : users) {
            if (u.getUserId() == userId) return u;
        }
        return null;
    }

    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void showAllUsers() {
        if (users.isEmpty()) {
            System.out.println("No registered users.");
            return;
        }
        for (User u : users) {
            System.out.println(u);
        }
    }
}
