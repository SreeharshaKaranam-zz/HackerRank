package com.sreeharshahackerrank.alg;

import java.util.Scanner;

public class CatandMouse {

	static String[] catAndMouse(int x, int y, int z) {

		int size = 0;
		String[] result = new String[size + 1];

		if (z > x && z > y) {
			if ((x + z) > (y + z)) {
				result[size] = "Cat A";
			} else if ((y + z) > (x + z)) {
				result[size] = "Cat B";
			} else if ((y + z) == (x + z)) {
				result[size] = "Mouse C";
			}
		} else if (x < z && z < y) {
			if ((y - z) > (z - x)) {
				result[size] = "Cat A";
			} else if ((y - z) < (z - x)) {
				result[size] = "Cat B";
			} else if ((y - z) == (z - x)) {
				result[size] = "Mouse C";
			}
		} else if (x > z && z > y) {
			if ((z - y) > (x - z)) {
				result[size] = "Cat A";
			} else if ((z - y) < (x - z)) {
				result[size] = "Cat B";
			} else if ((z - y) == (x - z)) {
				result[size] = "Mouse C";
			}
		} else if (x > z && y > z) {

			if ((x - z) > (y - z)) {
				result[size] = "Cat B";
			} else if ((x - z) < (y - z)) {
				result[size] = "Cat A";
			} else if ((x - z) == (y - z)) {
				result[size] = "Mouse C";
			}

		} else if ((x == z && y == z)) {
			result[size] = "Mouse C";
		} else if (y == z) {
			result[size] = "Cat B";
		} else if (x == z) {
			result[size] = "Cat A";
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			int x = in.nextInt();
			int y = in.nextInt();
			int z = in.nextInt();
			String[] result = catAndMouse(x, y, z);
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
			}
			System.out.println("");

		}
		in.close();
	}

}
