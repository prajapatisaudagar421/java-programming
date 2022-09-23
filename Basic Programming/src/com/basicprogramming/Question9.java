package com.basicprogramming;

public class Question9 {
static void decimalToBinary(int num) {
	int[] binary = new int[32];
	int i = 0;
	while (num != 0) {
		binary[i] = num%2;
		num = num/2;
		i++;
	}
	for(int j = i-1;j>=0;j--) {
		System.out.print(binary[j]+" ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		decimalToBinary(8);

	}

}
