package com.basicprogramming;

public class Question26 {
static void smallestElementOfArray(int[] arr) {
	int smallest = arr[0];
	for (int i = 1; i < arr.length; i++) {
		if(smallest>arr[i]) {
			smallest = arr[i];
		}
		
	}
	System.out.println(smallest);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,5,10,8,9};
		smallestElementOfArray(arr);
	}

}
