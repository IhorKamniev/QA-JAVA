package com.epam.hometask8.model;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Comparator;

public class Books /*implements Comparator*/{

    private int numbers = 0;
    private Book[] library;

    public Books(int arraySize) {
        this.library = new Book[arraySize];
    }

    public boolean addBook(Book book) {
        if (numbers >= library.length) {
            return false;
        }
        library[numbers++] = book;
        return true;
    }

    public String viewBooks() {
        if (numbers == 0) {
            return "No books!";
        }
        String books = "";
        for (int i = 0; i < numbers; i++) {
            books += library[i].toString();
            books += "\n";
        }
        return books;
    }

    public void changePrice(int percent) {
        for (int i = 0; i < numbers; i++) {
            double price = library[i].getPrice();
            price = price + (price * ((double) percent / 100));
            library[i].setPrice(price);
        }
    }

    public Books searchByAuthor(String author) {
        int booksByAuthor = 0;
        for (int i = 0; i < numbers; i++) {
            if (library[i].getAuthor().equals(author)) {
                booksByAuthor++;
            }
        }
        if (booksByAuthor > 0) {
            Books list = new Books(booksByAuthor);
            for (int i = 0; i < numbers; i++) {
                if (library[i].getAuthor().equals(author)) {
                    list.addBook(library[i]);
                }
            }
            return list;
        } else {
            System.out.println("There are no books published by this author!");
            return new Books(0);
        }
    }

    public Books searchAfterYear(int year) {
        int booksAfterYear = 0;
        for (int i = 0; i < numbers; i++) {
            if (library[i].getYear() > year) {
                booksAfterYear++;
            }
        }
        if (booksAfterYear > 0) {
            Books list = new Books(booksAfterYear);
            for (int i = 0; i < numbers; i++) {
                if (library[i].getYear() > year) {
                    list.addBook(library[i]);
                }
            }
            return list;
        } else {
            System.out.println("There are no books published after this year!");
            return new Books(0);
        }
    }

    /*public void copyOfArray(Book[] library) {

        Book[] clonedArray = library.clone();
    }

        @Override
        public int compare(Object o1, Object o2) {
            String publisher1 = ((Book) o1).getPublishingHouse();
            String publisher2 = ((Book) o2).getPublishingHouse();
            return publisher1.compareTo(publisher2);
        }*/
}



