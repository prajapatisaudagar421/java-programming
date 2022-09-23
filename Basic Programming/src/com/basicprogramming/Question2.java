package com.basicprogramming;

public class Question2 {
static void armstrong(int num) {
	int n = num, n1 = num, sum =0,count=0;
	while(n1 != 0) {
		count++;
		n1 = n1/10;
	}
	while(n != 0) {
		int remender = n%10;
		sum = (int) (sum+Math.pow(remender, count));
		n = n/10;
	}
	if(num == sum) {
		System.out.println("yes");
	}else {
		System.out.println("no");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		armstrong(153);
	}

}
