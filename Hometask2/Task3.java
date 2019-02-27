package com.epam.hometask2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double pounds = in.nextDouble();
        double weight = pounds / 2.2046;
        int kilos = (int)(weight);
        int grams = (int)((weight - kilos) * 1000);
        System.out.println(pounds+" Pounds "+ " = "+ kilos+" kilos and "+ grams+" grams");

    }
}
