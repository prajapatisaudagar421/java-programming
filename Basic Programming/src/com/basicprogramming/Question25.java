package com.basicprogramming;

public class Question25 {
static void largestElementOfArray(int[] arr) {
	int largest = arr[0];
	for (int i = 1; i < arr.length; i++) {
		if(largest<arr[i]) {
			largest = arr[i];
		}
	}
	System.out.println(largest);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,5,10,8,9};
		largestElementOfArray(arr);
	}

}
