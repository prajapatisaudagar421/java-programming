package com.basicprogramming;

public class Question5 {
static void facorial(int num) {
	int fact = 1;
	if(num<0) {
		System.out.println("nagitive number doesn't exist");
	}else {
		for (int i = 1; i <= num; i++) {
			fact = fact*i;
		}
	}
	System.out.println(fact);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		facorial(5);
	}

}
