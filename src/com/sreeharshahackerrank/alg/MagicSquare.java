package com.sreeharshahackerrank.alg;

import java.util.Scanner;

public class MagicSquare {

	static int formingMagicSquare(int[][] s) {

		int row1Count = 0;
		int row2Count = 0;
		int row3Count = 0;
		int col1Count = 0;
		int col2Count = 0;
		int col3Count = 0;
		int length = (s.length - 1);
		int[][] temp = new int[s.length][s.length];
		int diff1 = 0;
		int diff2 = 0;
		int count = 0;

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				if (i == 0) {
					row1Count = row1Count + s[i][j];
				} else if (i == 1) {
					row2Count = row2Count + s[i][j];
				} else if (i == 2) {
					row3Count = row3Count + s[i][j];
				}

				temp[i][j] = s[i][j];
			}
		}

		while (length > -1) {
			for (int i = 0; i < s.length; i++) {
				if (length == 2) {
					col3Count = col3Count + s[i][length];
				}
				else if (length == 1) {
					col2Count = col2Count + s[i][length];
				}
				else if (length == 0) {
					col1Count = col1Count + s[i][length];
				}
			}
			length--;

		}

		if ((row1Count == row2Count) && (row1Count != row3Count)) {
			diff1 = row2Count - row3Count;
			boolean incrementFlag = false;
			if (diff1 > 0)
				incrementFlag = true;
			for (int i = 2; i < s.length; i++) {
				for (int j = 0; j < s.length; j++) {
					if (incrementFlag) {
						temp[i][j] = temp[i][j] + diff1;
					}
				}
			}
		}

		if ((col1Count == col2Count) && (col1Count != col3Count)) {
			diff2 = col2Count - col3Count;
			boolean incrementFlag = false;
			if (diff2 > 0)
				incrementFlag = true;
			for (int i = 2; i < s.length; i++) {
				for (int j = 0; j < s.length; j++) {
					if (incrementFlag) {
						temp[i][j] = temp[i][j] + diff2;
					}
				}
			}
		}

		return (diff1 + diff2);

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] s = new int[3][3];
		for (int s_i = 0; s_i < 3; s_i++) {
			for (int s_j = 0; s_j < 3; s_j++) {
				s[s_i][s_j] = in.nextInt();
			}
		}
		int result = formingMagicSquare(s);
		System.out.println(result);
		in.close();
	}
}
