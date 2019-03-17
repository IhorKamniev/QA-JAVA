package com.epam.hometask6;

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

    public void view(){

        System.out.print("ID: "+this.id+", ");
        System.out.print("Name: "+this.name+", ");
        System.out.print("Author: "+this.author+", ");
        System.out.print("Publisher: "+this.publishingHouse+", ");
        System.out.print("Year: "+this.year+", ");
        System.out.print("Number of pages: "+this.pages+", ");
        System.out.print("Price: "+(double)(Math.round(this.price * 100)/100));
    }

}

