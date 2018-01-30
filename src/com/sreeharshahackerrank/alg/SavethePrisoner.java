package com.sreeharshahackerrank.alg;

import java.util.Scanner;

public class SavethePrisoner {

	static int saveThePrisoner(int n, int m, int s) {

		int position = 0;
		position = s + (m - 1);

		if (position <= n) {
			return position;
		} else {
			if (Math.abs(n - position) <= n)
				return Math.abs(n - position);
			else if ((position % n) == 0)
				return (n);
			else
				return (position % n);
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int m = in.nextInt();
			int s = in.nextInt();
			int result = saveThePrisoner(n, m, s);
			System.out.println(result);
		}
		in.close();
	}
}
