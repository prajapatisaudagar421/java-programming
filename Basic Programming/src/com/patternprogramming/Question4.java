package com.patternprogramming;

public class Question4 {
static void pattern(char ch) {
	for (char i = 'A'; i <= ch; i++) {
		for (char j = 'A'; j <= ch; j++) {
			System.out.print(i);
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern('E');

	}

}
