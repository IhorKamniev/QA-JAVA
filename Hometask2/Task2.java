package com.epam.hometask2;

public class Main {

    public static void main(String[] args) {
	int firstNum = 456;
	int ones = firstNum % 10; // 6
	int tens = (firstNum - ones) % 100;// 50
	int hundreds = (firstNum - ones - tens) ; // 400

	int secondNum = ones * 100 + tens + hundreds / 100;
	System.out.println("Difference between "+firstNum+" and "+secondNum+" is: "+ Math.abs(firstNum-secondNum));
    }
}
