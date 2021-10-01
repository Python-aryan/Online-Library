package com.company;
import java.util.Scanner;
class Library {

    // Add Book
    public void addBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type the Book name you want to add :");
        String addBookto = sc.next();
        System.out.println("Please Enter your name: ");
        String addname = sc.next();
        System.out.println("Book Added 👍");
    }
    public void issueBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the book name to be issued :");
        String issuebook = sc.next();
        System.out.println("Please Enter the person name on whose name it should to be issued :");
        String issuername = sc.next();
        System.out.println("Book Issued 👍");
    }
    public void returnBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book name you want to return :");
        String retbook = sc.next();
        System.out.println("Please Enter your name: ");
        String retname = sc.next();
        System.out.println("Book Returned 👍");
    }
    public void showAvailibleBooks() {
        String avaliblecomicbooks[] = {"How To Be Happy", "The Colour Of Earth", "The Early Earth", "Eight Walls",
                "Mouse Guard"};
        System.out.println("Comic Books Avalible:");
        for (String element : avaliblecomicbooks) {
            System.out.println(element);
        }
        String avaliblemarvelbooks[] = {"Wanda Vision", "Empyre", "Thor: The Devourer King", "Guardians Reloaded",
                "Immortal Hulk", "Avengers: The Final Host", "Black Panther", "Spider-Man: Back to Basics", "Miles " +
                "Morales: Spider-Man ", "Who Is Iron Man?", "Doctor Strange", "Venom", "Star Wars", "Thanos"};
        System.out.println(" ");
        System.out.println("Marvel Comic Books :");
        for (String element:avaliblemarvelbooks) {
            System.out.println(element);
        }
    }
}
public class tuts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
//        lib.showAvailibleBooks();
//        lib.addBook();
//        lib.issueBook();
//        lib.returnBook();
        System.out.println("Welcome to this Libary !!");
        System.out.println("Please Enter 1 to Display the Available Books \n" +
                "Please press 2 to Issue A Book \n" +
                "Press 3 to Add A book \n" +
                "Press 4 to return a Issued Book");
        int input = sc.nextInt();
        if (input == 1) {
            lib.showAvailibleBooks();
        }

        else if (input == 2) {
            lib.issueBook();
        }

        else if (input == 3) {
            lib.addBook();
        }

        else if (input == 4) {
            lib.returnBook();
        }

        else {
            System.out.println("Please Enter A valid input !!");
        }
    }
}
