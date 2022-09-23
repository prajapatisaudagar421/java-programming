package com.basicprogramming;

public class Question10 {
static void countVowelConsonantsAndSpace(String str) {
	int vowels =0,consonants=0,spaces=0;
	for(int i =0; i<=str.length()-1;i++) {
		if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'|| str.charAt(i) == 'u'
				|| str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'|| str.charAt(i) == 'U') {
			vowels++;
		}else if(str.charAt(i) == ' ') {
			spaces++;
		}else {
			consonants++;
		}
	}
	System.out.println("vowels :"+vowels+" consonants :"+consonants+" spaces :"+spaces);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countVowelConsonantsAndSpace("saudagar prajapti");

	}

}
