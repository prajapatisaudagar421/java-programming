package com.basicprogramming;

public class Question28 {
static void printRepetition(int[] arr) {
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			if(arr[i] ==arr[j]) {
				System.out.println(arr[i]);
				return;
			}
		}
	}
	System.out.println("not repeted elements");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,2,6,7,8,3};
		printRepetition(arr);

	}

}
