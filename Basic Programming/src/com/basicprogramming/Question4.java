package com.basicprogramming;

public class Question4 {
static void primeNumber(int num) {
	int flag =0;
	for(int i =2; i<=num/2;i++) {
		if(num%i == 0) {
			flag++;
			break;
		}
	}
	if(flag == 1) {
		System.out.println("not prime");
	}else {
		System.out.println("prime");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeNumber(4);
	}

}
