package com.basicprogramming;

public class Question22 {
static void largestOfThreeNumber(int num1, int num2, int num3) {
	if(num1>num2) {
		if(num1>num3) {
			System.out.println(num1);
		}else {
			System.out.println(num3);
		}
	}else if(num2>num3) {
		System.out.println(num2);
	}else {
		System.out.println(num3);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		largestOfThreeNumber(10, 2, 6);

	}

}
