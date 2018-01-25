package com.sreeharshahackerrank.alg;

import java.util.Scanner;

public class GradingStudents {

	static int[] solve(int[] grades) {

		int[] finalGrades = new int[grades.length];
		for (int i = 0; i < grades.length; i++) {
			int nextVal = (((grades[i] / 5) + 1) * 5);
			int diff = nextVal-grades[i];

			if (diff < 3 && grades[i] >= 38) {
				finalGrades[i] = nextVal;
			} else if (diff >= 3 || grades[i] < 38) {
				finalGrades[i] = grades[i];
			}
		}
		return finalGrades;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int[] grades = new int[n];
		for (int grades_i = 0; grades_i < n; grades_i++) {
			grades[grades_i] = in.nextInt();
		}
		in.close();
		int[] result = solve(grades);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");

	}

}
