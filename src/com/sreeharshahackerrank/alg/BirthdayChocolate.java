package com.sreeharshahackerrank.alg;

import java.util.Scanner;

public class BirthdayChocolate {

	static int solve(int n, int[] s, int d, int m) {

		int count = 0;
		int total = 0;
		int a = 0;
		int j = 0;

		for (int i = 0; i < n; i++) {

			j = i;
			while (a < m) {

				if (j < n)
					total = total + s[j];
				a++;
				j++;

			}
			if (total == d) {
				count++;
			}
			a = 0;
			total = 0;

		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] s = new int[n];
		for (int s_i = 0; s_i < n; s_i++) {
			s[s_i] = in.nextInt();
		}
		int d = in.nextInt();
		int m = in.nextInt();
		int result = solve(n, s, d, m);
		in.close();
		System.out.println(result);
	}
}
