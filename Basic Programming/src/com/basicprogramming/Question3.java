package com.basicprogramming;

public class Question3 {
static void sumOfDigits(int num) {
	int sum =0;
	while (num != 0) {
		int remender = num%10;
		sum = sum + remender;
		num = num/10;
	}
	System.out.println(sum);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumOfDigits(1234);
	}

}
