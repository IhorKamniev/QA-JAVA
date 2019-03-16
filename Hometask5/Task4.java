package com.epam.hometask5;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        int size = specifySize();
        int[] arrayInt = createArrayInt(size);
        int negativeInt = countNegativeInt(arrayInt);
        int positiveInt = countPositiveInt(arrayInt);
        int[] negativeArrayInt = findNegativeInt(arrayInt, negativeInt);
        int[] positiveArrayInt = findPositiveInt(arrayInt, positiveInt);
        System.out.println("Start array:" + Arrays.toString(arrayInt));
        System.out.println("Negative array:" + Arrays.toString(negativeArrayInt));
        System.out.println("Positive array:" + Arrays.toString(positiveArrayInt));
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
            arrayInt[i] = (int)((Math.random() * 15)-10);
        }
        return arrayInt;
    }

    static int countNegativeInt (int[] array){
        int negativeCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if( array[i] < 0){
                negativeCounter++;
            }
        }
        return  negativeCounter;
    }

    static int countPositiveInt (int[] array){
        int positiveCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if( array[i] > 0){
                positiveCounter++;
            }
        }
        return  positiveCounter;
    }

    static int[] findNegativeInt (int[] array, int size){
        int[] arrayNegative = new int[size];
        int countNegative = 0;
        for (int i = 0; i < array.length; i++) {
            if( array[i] < 0){
                arrayNegative[countNegative] = array[i];
                countNegative++;
            }
        }
        return  arrayNegative;
    }

    static int[] findPositiveInt (int[] array, int size){
        int[] arrayPositive = new int[size];
        int countPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if( array[i] > 0){
                arrayPositive[countPositive] = array[i];
                countPositive++;
            }
        }
        return  arrayPositive;
    }

}
