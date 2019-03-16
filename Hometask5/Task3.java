package com.epam.hometask5;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        int size = specifySize();
        int[] firstArrayInt = createArrayInt(size);
        int[] secondArrayInt = createArrayInt(size);
        int[] thirdArrayInt = countSumArrays(firstArrayInt, secondArrayInt, size);
        System.out.println("Array #1:" + Arrays.toString(firstArrayInt));
        System.out.println("Array #2:" + Arrays.toString(secondArrayInt));
        System.out.println("Array #3:" + Arrays.toString(thirdArrayInt));
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

    static int[] countSumArrays (int[] array, int[] array2, int size){
        int[] array3 = new int[size];
        for (int i = 0; i < array.length; i++) {
            array3[i] = array[i]+array2[i];
        }
        return array3;
    }
}
