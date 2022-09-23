package com.basicprogramming;

public class Question8 {
static void binaryToDecimal(int num) {
	int decNum =0, i =0;
	while (num != 0) {
		int remender = num%10;
		decNum = (int) (decNum+remender*Math.pow(2, i));
		num =num/10;
		i++;
	}
	System.out.println(decNum);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binaryToDecimal(1000);

	}

}
