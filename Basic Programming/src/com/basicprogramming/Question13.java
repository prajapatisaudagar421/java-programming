package com.basicprogramming;

public class Question13 {
static void quadraticEquation(double a, double b,double c) {
	double root1, root2;
	double determinant = b*b-4*a*c;
	if(determinant>0) {
		root1 = (-b+Math.sqrt(determinant))/(2*a);
		root2 = (-b-Math.sqrt(determinant))/(2*a);
		System.out.println("root1 : "+root1+" root2 : "+root2);
	}else if(determinant == 0) {
		root1 = root2 = -b/(2*a);
		System.out.println("root1 = root2 = "+root1);
	}else {
		double real = -b/(2*a);
		double imaginary = Math.sqrt(-determinant)/(2*a);
		System.out.println("root1 "+real+" "+imaginary);
		System.out.println("root2 "+real+" "+imaginary);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quadraticEquation(2.2, 2.3, 2.4);
	}

}
