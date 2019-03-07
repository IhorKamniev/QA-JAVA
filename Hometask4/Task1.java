package com.epam.hometask4.Task1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Unique symbols: " + getUnique(str));
    }

    public static String getUnique (String str){
        int len = str.length();
        int counter = 0;
        String result = "";
        while (counter < len){
            char ch = str.charAt(counter);
            if (!result.contains(String.valueOf(ch))){
                result = result + ch;
            }
            counter++;
        }
        return result;
    }
}
