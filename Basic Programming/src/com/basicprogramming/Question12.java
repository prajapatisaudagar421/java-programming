package com.basicprogramming;

public class Question12 {
static void perfectSquare(int num) {
	for(int i =0; i<= num; i++) {
		if(num == i*i) {
			System.out.println("perfect square");
			return;
		}
	}
	System.out.println("not perfect square");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perfectSquare(4);

	}

}
