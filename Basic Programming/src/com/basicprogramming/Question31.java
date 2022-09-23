package com.basicprogramming;

public class Question31 {
static void countAlphabetsNumbersAndSpecialCharcter(String str) {
	int alphabets = 0, numbers =0, specialCharter =0;
	for (int i = 0; i < str.length(); i++) {
		if((str.charAt(i)>=65 && str.charAt(i)<=90)||(str.charAt(i)>=97 && str.charAt(i)<=122)) {
			alphabets++;
		}
		else if(str.charAt(i)>=48 && str.charAt(i)<=57) {
			numbers++;
		}
		else {
			specialCharter++;
		}
	}
	System.out.println("alphabets : "+alphabets+" numbers : "+numbers+" specialCharcter : "+specialCharter);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countAlphabetsNumbersAndSpecialCharcter("saudagarprajapti234@gmail.com");

	}

}
