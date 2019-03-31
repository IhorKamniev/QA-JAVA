package com.epam.hometask7;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius=" + radius;
    }

    @Override
    double calcArea(){
        return (Math.PI * radius * radius);
    }
}