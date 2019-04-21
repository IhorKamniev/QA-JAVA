package com.epam.hometask8.controller;

import java.util.Scanner;

public class InputUtil {
    private static Scanner sc =
            new Scanner(System.in);

    public static int inputInt() {
        return sc.nextInt();
    }

    public static String inputString() {
        return sc.nextLine();
    }

    public static boolean checkIsInt() {
        return sc.hasNextInt();
    }


}
