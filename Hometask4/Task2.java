package com.epam.hometask4.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number= sc.nextInt();
        System.out.println("Result of conversion: " + getConvert(number));
    }

    public static String getConvert (int number){
        String result = "";
        int remainder;
        String bit;
        while (number > 0){
            remainder = number % 2;
            number = (number - remainder) / 2;
            bit = String.valueOf(remainder);
            result = bit + result;
        }
        return result;
    }
}

