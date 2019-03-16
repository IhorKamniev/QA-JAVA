package com.epam.hometask5;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        int[] arrayInt = createArrayInt(specifySize());
        System.out.println("Array:" + Arrays.toString(arrayInt));
        System.out.println("Amount of unpaired numbers:" + countUnpaired(arrayInt));
        System.out.println("Sum of unpaired numbers:" + sumUnpaired(arrayInt));
    }

    static int specifySize (){
        Scanner sc = new Scanner(System.in);
        int size;
        do{
            System.out.print("Enter a size of array: ");
            size = sc.nextInt();
        }
        while (size <= 0);
        return size;
    }

    static int[] createArrayInt (int size){
        int[] arrayInt = new int[size];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = (int)((Math.random() * 15));
        }
        return arrayInt;
    }

    static int countUnpaired (int[] array) {
        int amount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                amount++;
            }
        }
        return amount;
    }

    static int sumUnpaired (int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {
                sum += array[i];
            }
        }
        return sum;
    }
}

