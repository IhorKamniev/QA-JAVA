package com.epam.hometask3;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        final int COMPARE = 7;
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose the number of figure(from 1 to 5): ");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                int line = 1;
                while (line <= 7) {
                    int asterisk = line;
                    while (asterisk >= 1) {
                        System.out.print("*");
                        asterisk--;
                    }
                    System.out.println();
                    line++;
                }
                line = 6;
                while (line >= 1) {
                    int asterisk = line;
                    while (asterisk >= 1) {
                        System.out.print("*");
                        asterisk--;
                    }
                    System.out.println();
                    line--;
                }
                break;
            case 2:
                line = 7;
                while (line >= 1) {
                    int asterisk = line;
                    int space = line;
                    while (space <= COMPARE) {
                        System.out.print(" ");
                        space++;
                    }
                    while (asterisk >= 1) {
                        System.out.print("*");
                        asterisk--;
                    }
                    System.out.println();
                    line--;
                }
                break;
            case 3:
                line = 7;
                while (line >= 1) {
                    int asterisk = line;
                    int space = line;
                    while (space >= 1) {
                        System.out.print(" ");
                        space--;
                    }
                    while (asterisk <= COMPARE) {
                        System.out.print("*");
                        asterisk++;
                    }
                    System.out.println();
                    line--;
                }
                break;
            case 4:
                line = 7;
                while (line >= 1) {
                    int asterisk = line;
                    int space = line;
                    while (space >= 1) {
                        System.out.print(" ");
                        space--;
                    }
                    while (asterisk <= COMPARE) {
                        System.out.print("*");
                        asterisk++;
                    }
                    System.out.println();
                    line--;
                }
                line = 6;
                while (line >= 1) {
                    int asterisk = line;
                    int space = line;
                    while (space <= COMPARE) {
                        System.out.print(" ");
                        space++;
                    }
                    while (asterisk >= 1) {
                        System.out.print("*");
                        asterisk--;
                    }
                    System.out.println();
                    line--;
                }
                break;
            case 5:
                int i = 0;
                while (i < 2) {
                    line = 7;
                    while (line >= 1) {
                        int asterisk = line;
                        int asterisk2 = line;
                        int space = line;
                        while (space >= 1) {
                            System.out.print(" ");
                            space--;
                        }
                        while (asterisk <= COMPARE) {
                            System.out.print("*");
                            asterisk++;
                        }
                        while (asterisk2 <= COMPARE) {
                            System.out.print("*");
                            asterisk2++;
                        }
                        System.out.println();
                        line--;
                    }
                    i++;
                }
                break;
        }
    }
}
