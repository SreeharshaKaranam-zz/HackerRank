package com.sreeharshahackerrank.alg;

import java.util.Scanner;

public class Kangaroo {

	static String kangaroo(int x1, int v1, int x2, int v2) {
		int kangaroo1 = x1 + v1;
		int kangaroo2 = x2 + v2;
		String result = "NO";

		if ((x1 > x2) && v1 > v2) {
			return result;
		} else if ((x2 > x1) && v2 > v1) {
			return result;
		} else {

			for (int i = 0; i < 10000; i++) {
				if (kangaroo1 == kangaroo2) {
					return "YES";
				} else {

					kangaroo1 = kangaroo1 + v1;
					kangaroo2 = kangaroo2 + v2;
				}
			}

		}
		return result;
			
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		String result = kangaroo(x1, v1, x2, v2);
		in.close();
		System.out.println(result);
	}

}
