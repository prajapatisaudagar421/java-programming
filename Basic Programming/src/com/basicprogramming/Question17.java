package com.basicprogramming;

public class Question17 {
	static void fahrenheitToCelcius(int fahrenheit) {
		double celcius = (fahrenheit-32)*5/9;
		System.out.println(celcius);
	}
	static void celciusToFahreneit(int celcius) {
		double fahrenheit = (celcius*9/5)+32;
		System.out.println(fahrenheit);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fahrenheitToCelcius(98);
		celciusToFahreneit(36);

	}

}
