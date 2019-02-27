package com.epam.hometask2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter deposit: ");
        double deposit = in.nextDouble();
        System.out.println("Enter months: ");
        int months =in.nextInt();
        System.out.println("Enter percents: ");
        double percents =in.nextInt();
        int income = (int)(deposit*(percents/100)/12*months);
        System.out.println("Income: "+income);
    }
}
