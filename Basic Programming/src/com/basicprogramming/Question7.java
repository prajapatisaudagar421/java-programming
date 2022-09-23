package com.basicprogramming;

public class Question7 {
static void swap(int num1, int num2) {
	num1 = num1 + num2;
	num2 = num1 - num2;
	num1 = num1 - num2;
	System.out.println("num1 :"+num1+" num2 :"+num2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		swap(5, 6);
	}

}
