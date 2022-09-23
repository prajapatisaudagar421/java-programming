package com.basicprogramming;

public class Question20 {
static void gcd(int num1, int num2) {
	int i,gcd=1;
	for(i= 1;i<=num1&& i<=num2;i++) {
		if(num1%i== 0 && num2%i == 0) {
			gcd = i;
		}
	}
	System.out.println(gcd);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gcd(10, 2);
	}

}
