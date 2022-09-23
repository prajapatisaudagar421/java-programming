package com.patternprogramming;

public class Question6 {
static void pattern(int n) {
	for (int i = 1; i <= n; i++) {
		for (int j = i; j <= n; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(5);

	}

}
