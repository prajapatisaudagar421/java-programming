package com.basicprogramming;

public class Question6 {
static void fibonacci(int num) {
	int n1 =0, n2 =1, next =0;
	for (int i = 1; i <= num; i++) {
		System.out.print(n1+" ");
		next = n1+n2;
		n1 =n2;
		n2 = next;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonacci(5);
	}

}
