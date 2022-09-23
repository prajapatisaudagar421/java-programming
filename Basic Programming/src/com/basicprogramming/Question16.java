package com.basicprogramming;

public class Question16 {
static void calculateDaysWeeksAndYears(int days) {
	int years = days/365;
	int weeks = (days%365)/7;
	int day = days-((years*365)+(weeks*7));
	System.out.println("years : "+years+" weeks : "+weeks+" days : "+day);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculateDaysWeeksAndYears(1201);
	}

}
