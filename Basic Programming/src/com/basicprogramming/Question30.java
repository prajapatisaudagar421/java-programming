package com.basicprogramming;

public class Question30 {
static void additionOfMatrix(int[][] first, int[][] second) {
	int[][] sum = new int[first.length][second.length];
	for (int i = 0; i < first.length; i++) {
		for (int j = 0; j < second.length; j++) {
			sum[i][j] = first[i][j]+second[i][j];
		}
	}
	//print matrix
	for (int i = 0; i < sum.length; i++) {
		for (int j = 0; j < sum.length; j++) {
			System.out.print(sum[i][j]+" ");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] first = {{1,2,3},{1,2,3},{1,2,3}};
		int[][] second = {{1,2,3},{1,2,3},{1,2,3}};
		additionOfMatrix(first, second);
	}

}
