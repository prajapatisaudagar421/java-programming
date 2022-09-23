package com.basicprogramming;

public class Question21 {
static void lcm(int num1 , int num2) {
	int maxNum;
	maxNum = (num1>num2)?num1:num2;
	while (true) {
		if(maxNum%num1 == 0 && maxNum%num2 == 0) {
			System.out.println(maxNum);
			break;
		}
		maxNum++;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lcm(10, 2);
	}

}
