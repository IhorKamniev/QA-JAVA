package com.epam.hometask7;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c){
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString() + ", a=" + a + ", b=" + b + ", c=" + c;
    }

    @Override
    double calcArea(){
        final double P = (a + b + c)/2;                // semi-perimeter
        return Math.sqrt(P*(P-a)*(P-b)*(P-c));
    }
}
