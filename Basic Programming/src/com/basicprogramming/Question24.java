package com.basicprogramming;

public class Question24 {
static void reverseOfArray(int[] arr) {
	for (int i = arr.length-1; i>=0; i--) {
		System.out.print(arr[i]+" ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5,6};
		reverseOfArray(arr);
	}

}
