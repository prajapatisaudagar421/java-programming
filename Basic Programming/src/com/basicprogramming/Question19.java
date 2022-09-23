package com.basicprogramming;

public class Question19 {
static void leapYear(int years) {
	if(years%400 ==0 && years%100 == 0) {
		System.out.println("yes");
	}else if(years%4 == 0 && years%100 != 0) {
		System.out.println("yes");
	}else {
		System.out.println("no");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leapYear(2000);
	}

}
