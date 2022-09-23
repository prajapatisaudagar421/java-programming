package com.basicprogramming;

public class Question29 {
static void largestSum(int[] arr1, int [] arr2) {
	int sum1 = 0, sum2=0;
	for (int i = 0; i < arr1.length; i++) {
		sum1 = sum1+arr1[i];
	}
	for (int i = 0; i < arr2.length; i++) {
		sum2 = sum2+arr2[i];
	}
	if(sum1>sum2) {
		System.out.println("array1 is largest sum");
	}else if(sum2>sum1) {
		System.out.println("array2 is largest sum");
	}else {
		System.out.println("both array are same");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {11,2,3,4,5};
		int[] arr2 = {1,2,3,4};
		largestSum(arr1, arr2);

	}

}
