package com.epam.hometask5;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int[] arrayInt = createArrayInt(specifySize());
        int[] newArrayInt = Arrays.copyOf(arrayInt, arrayInt.length);
        System.out.println("Array:" + Arrays.toString(arrayInt));
        System.out.println("Inverted array:" + Arrays.toString(invertArrayInt(newArrayInt)));
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
            arrayInt[i] = (int)(Math.random() * 10);
        }
        return arrayInt;
    }

    static int[] invertArrayInt (int[] array){
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        return array;
    }

}
