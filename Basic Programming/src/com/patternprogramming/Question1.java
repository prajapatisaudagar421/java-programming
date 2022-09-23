package com.patternprogramming;

public class Question1 {
static void pattern(int n) {
	for (int i = 0; i < n; i++) {
		for (int j = 0; j <n; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(4);

	}

}
