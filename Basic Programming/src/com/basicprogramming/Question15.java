package com.basicprogramming;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter first number");
		int num1 = in.nextInt();
		System.out.println("enter second number");
		int num2 = in.nextInt();
		System.out.println("1 : Addition");
		System.out.println("2 : Substraction");
		System.out.println("3 : Multiplication");
		System.out.println("4 : Division");
		System.out.println("Input Your option");
		int opt = in.nextInt();
		switch (opt) {
		case 1:
			System.out.println("addition : "+(num1+num2));
			break;

		case 2:
			System.out.println("subtraction :"+(num1-num2));

			break;
		case 3:
			System.out.println("multiplication :"+num1*num2);
			break;
		case 4:
			if(num2 == 0) {
				System.out.println("divede by zero");
			}
			else {
				System.out.println("Division : "+num1/num2);
			}
			break;

		default:
			System.out.println("Input correct option");
			break;
		}

	}

}
