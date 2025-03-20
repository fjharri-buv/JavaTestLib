package com.example;

public class App {
    public static void main(String[] args) {
        Library library = new Library();
        
        Book book1 = new Book("Effective Java", "Joshua Bloch", "12345");
        Book book2 = new Book("Clean Code", "Robert C. Martin", "67890");

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Total Books: " + library.getTotalBooks());
        System.out.println("Finding book with ISBN 12345: " + library.findBookByIsbn("12345").getTitle());
    }
}
    