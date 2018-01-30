package com.sreeharshahackerrank.alg;

import java.util.Scanner;

public class BeautifulDays {

	static int beautifulDays(int i, int j, int k) {

		int reverseval = 0;
		long divisibleval = 0;
		int result = 0;

		for (int m = i; m <= j; m++) {
			reverseval = reverse(m);
			divisibleval = Math.abs(m - reverseval);

			if ((divisibleval % k) == 0) {
				result++;
			}
		}

		return result;
	}

	static int reverse(int p) {

		String s = String.valueOf(p);
		StringBuilder input = new StringBuilder(s);
		input = input.reverse();
		String reverse = input.toString();

		return Integer.parseInt(reverse);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		int j = in.nextInt();
		int k = in.nextInt();
		int result = beautifulDays(i, j, k);
		System.out.println(result);
		in.close();
	}
}
