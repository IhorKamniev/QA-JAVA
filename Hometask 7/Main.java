package com.epam.hometask7;

public class Main {

    public static void main(String[] args) {
        Shape Rect1 = new Rectangle("white", 12, 5);
        Shape Rect2 = new Rectangle("blue", 2, 9);
        Shape Rect3 = new Rectangle("yellow", 1, 8);
        Shape Rect4 = new Rectangle("green", 9, 15);
        Shape Circle1 = new Circle("red", 2);
        Shape Circle2 = new Circle("black", 5);
        Shape Circle3 = new Circle("purple", 6);
        Shape Triangle1 = new Triangle("pink", 7, 6, 9);
        Shape Triangle2 = new Triangle("magenta", 10, 5, 8);
        Shape[] arr = {Rect1, Rect2, Rect3, Rect4, Circle1, Circle2, Circle3, Triangle1, Triangle2};
        showArray(arr);
        sumArea(arr);
        double [] areas = sumOfType(arr);
        System.out.println("Area 1: " + areas[0] + ", Area 2: " + areas[1] + ", Area 3: " + areas[2]);
    }

    public static void showArray(Shape[] arr) {
        for (Shape temp : arr) {
            System.out.println(temp);
            System.out.println("Area of this figure:" + Math.round(temp.calcArea() * 100.0) / 100.0);
        }
    }

    public static void sumArea(Shape[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].calcArea();
        }
        System.out.println("Sum of areas: " + Math.round(sum * 100.0) / 100.0);
    }

    public static double [] sumOfType(Shape[] arr) {
        double sumOfCircleArea = 0;
        double sumOfRectArea = 0;
        double sumOfTriangleArea = 0;
        double [] areas = { sumOfCircleArea, sumOfRectArea, sumOfTriangleArea };
        for (int i = 0; i < arr.length; i++){
            if (arr[i] instanceof Circle) {
                areas[0] += arr[i].calcArea();
            }
            else if (arr[i] instanceof Rectangle) {
                areas[1] += arr[i].calcArea();
            }
            else if (arr[i] instanceof Triangle) {
                areas[2] += arr[i].calcArea();
            }
        }

        for (int i = 0; i < areas.length; i++) {
            areas[i] = Math.round((areas[i] * 100.0) / 100.0);
        }

        return areas;
    }
}
