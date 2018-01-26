package com.sreeharshahackerrank.alg;

import java.util.Scanner;

public class DiagonalDifference {

	static int diagonalDifference(int[][] a) {

		int corner1total = 0;
		int corner2total = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				if ((i == j)) {
					corner1total = corner1total + a[i][j];
				}
			}

		}
		int m=(a.length-1);
		for (int i = 0; i <a.length; i++) {
			for (int j = (a.length-1); j >= 0; j--) {

				if ((m==j)) {
					corner2total = corner2total + a[i][j];
				}
			}
			m--;

		}

		if (corner1total >= corner2total)
			return (corner1total - corner2total);
		else
			return (corner2total - corner1total);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] a = new int[n][n];
		for (int a_i = 0; a_i < n; a_i++) {
			for (int a_j = 0; a_j < n; a_j++) {
				a[a_i][a_j] = in.nextInt();
			}
		}
		int result = diagonalDifference(a);
		System.out.println(result);
		in.close();
	}

}
