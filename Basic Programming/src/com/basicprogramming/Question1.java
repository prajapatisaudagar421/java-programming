package com.basicprogramming;

public class Question1 {
	static void palindrome(int num) {
		int reverse =0,n = num;
		while (num != 0) {
			int remender = num%10;
			reverse = reverse*10+remender;
			num = num/10;		
		}
		if(n == reverse) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
	public static void main(String[] args) {
		palindrome(121);
	}
}
