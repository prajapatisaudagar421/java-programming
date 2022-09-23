package com.basicprogramming;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Press 1 to calculate area of circle");
		System.out.println("Press 2 to calculate area of square");
		System.out.println("Press 3 to calculate area of sphere");
		System.out.println("Enter your choice");
		int n = in.nextInt();
		switch (n) {
		case 1:
			System.out.println("enter radius");
			int num = in.nextInt();
			double result = 3.14 * num * num;
			System.out.println(result);
			break;
		case 2:
			System.out.println("enter side of square");
			int num1 = in.nextInt();
			int square = num1 * num1;
			System.out.println(square);
			break;
		case 3:
			System.out.println("enter radius");
			int redius = in.nextInt();
			double sphere = 4 * (3.14 * redius * redius);
			System.out.println(sphere);
			break;

		default:
			System.out.println("wrong input");
			break;
		}

	}

}
