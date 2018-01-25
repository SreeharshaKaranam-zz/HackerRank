package com.sreeharshahackerrank.alg;

import java.util.Arrays;
import java.util.Scanner;

public class BetTwosets {

	static int getTotalX(int[] a, int[] b) {

		int resultCount = 0;
		int matchCounta = 0;
		int matchCountb = 0;
		Arrays.sort(a);
		Arrays.sort(b);
		int start = a[0];
		int end = b[b.length - 1];
		for (int i = start; i <= end; i++) {
			for (int j = 0; j < a.length; j++) {

				if ((i % a[j] == 0)) {
					matchCounta++;
				}
			}
				for (int k = 0; k < b.length; k++) {
					if ((b[k] % i == 0)) {
						matchCountb++;
					}
				}

				if ((matchCounta == a.length) && (matchCountb == b.length)) {
					resultCount++;
				}
				matchCounta=0;
				matchCountb=0;

		}
		return resultCount;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[] b = new int[m];
		for (int b_i = 0; b_i < m; b_i++) {
			b[b_i] = in.nextInt();
		}
		int total = getTotalX(a, b);
		System.out.println(total);
		in.close();
	}
}
