package com.epam.hometask6;

public class Books {

    private int arraySize;
    private int number = 0;
    private Book[] array;

    public Books(int arraySize){
        this.arraySize = arraySize;
        array = new Book[arraySize];
    }

    public void addBook(Book book) {
            array[number] = book;
            number++;
    }

    public void showBooks() {
            for (int i = 0; i < number; i++) {
                array[i].view();
                System.out.println();
            }
    }

    public void changePrice(int percent) {
        for (int i = 0; i < number; i++) {
            double price = array[i].getPrice();
            price = price + (price * ((double)percent / 100));
            array[i].setPrice(price);
        }
    }

    public Books searchByAuthor(String author) {
        int booksByAuthor = 0;
        for (int i = 0; i < number; i++) {
            if (array[i].getAuthor().equals(author)) {
                booksByAuthor++;
            }
        }
        if (booksByAuthor > 0) {
            Books list = new Books(booksByAuthor);
            for (int i = 0; i <= booksByAuthor; i++) {
                if (array[i].getAuthor().equals(author)) {
                    list.addBook(array[i]);
                }
            }
            return list;
        }
        else {
            System.out.println("There are no books published by this author!");
            return new Books(0);
        }
    }

    public Books searchAfterYear(int year) {
        int booksAfterYear = 0;
        for (int i = 0; i < number; i++) {
            if (array[i].getYear() > year) {
                booksAfterYear++;
            }
        }
        if (booksAfterYear > 0) {
            Books list = new Books(booksAfterYear);
            for (int i = 0; i < number; i++) {
                if (array[i].getYear() > year) {
                    list.addBook(array[i]);
                }
            }
            return list;
        }
        else {
            System.out.println("There are no books published after this year!");
            return new Books(0);
        }
    }
}

