package com.sreeharshahackerrank.alg;

import java.util.Scanner;

public class BonAppetit {

	static int bonAppetit(int n, int k, int b, int[] ar) {
		int totalCost = b;
		int actCost = 0;

		for (int i = 0; i < n; i++) {
			if (i != k) {
				actCost = actCost + ar[i];
			}

		}

		if ((actCost / 2) == totalCost) {
			return 0;
		} else {
			return totalCost - (actCost / 2);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int b = in.nextInt();
		int result = bonAppetit(n, k, b, ar);
		in.close();
		System.out.println(result == 0 ? "Bon Appetit" : result);
	}
}
