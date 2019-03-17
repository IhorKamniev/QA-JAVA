package com.epam.hometask6;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int size = specifySize();
        Books books = new Books (size);
        Book it = new Book(001, "It", "Stephen King", "Viking", 1986, 1138, 135.30);
        books.addBook(it);
        Book solaris = new Book(002, "Solaris", "Stanisław Lem", "MON", 1961, 204, 170);
        books.addBook(solaris);
        Book nightWatch = new Book(003, "Night Watch", "Sergei Lukyanenko", "ACT", 2004, 450, 100.99);
        books.addBook(nightWatch);
        Book theDaVinci = new Book(004,"The Da Vinci Code","Dan Brown","Doubleday",2003,689,200);
        books.addBook(theDaVinci);
        books.showBooks();
        System.out.println("Enter percents for price increasing:");
        books.changePrice(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter the author:");
        books.searchByAuthor(sc.nextLine()).showBooks();
        System.out.println("Enter the year:");
        books.searchAfterYear(sc.nextInt()).showBooks();

    }

    static int specifySize (){
        int size;
        do{
            System.out.print("Enter a size of array: ");
            size = sc.nextInt();
        }
        while (size <= 0);
        return size;
    }
}
