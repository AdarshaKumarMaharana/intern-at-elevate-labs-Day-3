package com.library.management;

public class User {
    private String name;
    private int userId;
    private static int idCounter = 1;

    public User(String name) {
        this.name = name;
        this.userId = idCounter++;
    }

    public String getName() { return name; }
    public int getUserId() { return userId; }

    @Override
    public String toString() {
        return "User ID: " + userId + ", Name: " + name;
    }
}
