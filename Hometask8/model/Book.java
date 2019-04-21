package com.epam.hometask8.model;


import java.util.Comparator;

public class Book {

    private int id;
    private String name;
    private String author;
    private String publishingHouse;
    private int year;
    private int pages;
    private double price;

    public Book(int id, String name, String author, String publishingHouse, int year, int pages, double price){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString () {
        return this.getClass().getSimpleName()
                + ": ID = " + id + "; Name = " + name
                + "; Author = " + author
                + "; Publisher = "
                + publishingHouse + "; Year = "
                + year + "; Pages = "
                + pages + "; Price = " + price;
    }

    public void changePrice(double percent) {
        this.price = (float) (price + price * percent / 100);
    }
}

