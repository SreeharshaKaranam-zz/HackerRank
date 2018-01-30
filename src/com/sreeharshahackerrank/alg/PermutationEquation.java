package com.sreeharshahackerrank.alg;

import java.util.Scanner;

public class PermutationEquation {

	static int[] permutationEquation(int[] p) {

		int temp = 0;
		int[] result = new int[p.length];
		int size = 0;
		for (int x = 1; x <= p.length; x++) {
			for (int j = 0; j < p.length; j++) {
				if (x == p[j]) {
					temp = j + 1;
					break;
				}

			}

			for (int k = 0; k < p.length; k++) {
				if (temp == p[k]) {
					if (size <= 0)
						result[size++] = k + 1;
					else
						result[size++] = k + 1;
				}

			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] p = new int[n];
		for (int p_i = 0; p_i < n; p_i++) {
			p[p_i] = in.nextInt();
		}
		int[] result = permutationEquation(p);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");

		in.close();
	}

}
