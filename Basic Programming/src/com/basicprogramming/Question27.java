package com.basicprogramming;

import java.util.Arrays;
import java.util.Iterator;

public class Question27 {
	static void leftShift(int[] arr, int shift) {
		if (shift > arr.length) {
			return;
		}
		int k = 0;
		int[] temp = new int[arr.length];
		for (int i = shift; i < arr.length; i++) {
			temp[k] = arr[i];
			k++;
		}
		for (int i = 0; i < shift; i++) {
			temp[k] = arr[i];
			k++;
		}
		System.out.println(Arrays.toString(temp));
	}

	static void rightShift(int[] arr, int shift) {
		if (shift > arr.length) {
			return;
		}
		int k = 0;
		int[] temp = new int[arr.length];
		for (int i = arr.length - 1; i > shift; i--) {
			temp[k] = arr[i];
			k++;
		}
		for (int i = 0; i <= shift; i++) {
			temp[k] = arr[i];
			k++;
		}
		System.out.println(Arrays.toString(temp));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		leftShift(arr, 2);
		//rightShift(arr, 2);

	}

}
