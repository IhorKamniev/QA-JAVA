package com.epam.hometask8.controller;

import com.epam.hometask8.model.Book;
import com.epam.hometask8.model.Books;
import com.epam.hometask8.view.ViewBooks;

import java.util.InputMismatchException;


public class ControllerBooks {
    private Books books;
    private ViewBooks viewBooks = new ViewBooks();
    private Validator validator = new Validator();

    public void run() {
        try {
            viewBooks.print("Enter size -> ");
            validator.catchNegativeArraySizeException();
            validator.catchInputMismatchException();
            books = new Books(InputUtil.inputInt());
            Book it = new Book(001, "It", "Stephen King", "Viking", 1986, 1138, 135.30);
            books.addBook(it);
            Book solaris = new Book(002, "Solaris", "Stanisław Lem", "MON", 1961, 204, 170);
            books.addBook(solaris);
            Book nightWatch = new Book(003, "Night Watch", "Sergei Lukyanenko", "ACT", 2004, 450, 100.99);
            books.addBook(nightWatch);
            Book theDaVinci = new Book(004, "The Da Vinci Code", "Dan Brown", "Doubleday", 2003, 689, 200);
            books.addBook(theDaVinci);
            viewBooks.print(books.viewBooks());

            try {
                viewBooks.print("\nEnter percent -> ");
                validator.catchInputMismatchException();
                books.changePrice(InputUtil.inputInt());
                viewBooks.print(books.viewBooks());
            } catch (InputMismatchException e) {
                viewBooks.print("Impossible to calculate sum");
            }

            InputUtil.inputString();
            viewBooks.print("\nEnter author -> ");
            Books nBooks = books.searchByAuthor(InputUtil.inputString());
            viewBooks.print(nBooks.viewBooks());


            try {
                viewBooks.print("\nEnter the year-> ");
                validator.catchInputMismatchException();
                Books yBooks = books.searchAfterYear(InputUtil.inputInt());
                viewBooks.print(yBooks.viewBooks());
            } catch (InputMismatchException e) {
                viewBooks.print("Impossible to search");
            }
        } catch (Exception e) {
            viewBooks.print("Impossible to work with library");
        }

        //  Arrays.sort(books, new Books());

    }
}
