package com.library.management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Library Management System");

        while (true) {
            System.out.println("\n1. Add Book");
            System.out.println("2. Register User");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Show All Books");
            System.out.println("6. Show All Users");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String bTitle = sc.nextLine();
                    System.out.print("Enter book author: ");
                    String bAuthor = sc.nextLine();
                    library.addBook(new Book(bTitle, bAuthor));
                    break;
                case 2:
                    System.out.print("Enter user name: ");
                    String uName = sc.nextLine();
                    library.registerUser(new User(uName));
                    break;
                case 3:
                    System.out.print("Enter book title to issue: ");
                    String iTitle = sc.nextLine();
                    System.out.print("Enter user ID: ");
                    int iUserId = sc.nextInt();
                    library.issueBook(iTitle, iUserId);
                    break;
                case 4:
                    System.out.print("Enter book title to return: ");
                    String rTitle = sc.nextLine();
                    library.returnBook(rTitle);
                    break;
                case 5:
                    library.showAllBooks();
                    break;
                case 6:
                    library.showAllUsers();
                    break;
                case 7:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
