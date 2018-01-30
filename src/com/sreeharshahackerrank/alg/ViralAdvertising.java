package com.sreeharshahackerrank.alg;

import java.util.Scanner;

public class ViralAdvertising {

	static int viralAdvertising(int n) {

		int people = 5;
		int likeCount = 0;
		int result = 0;

		while (n > 0) {

			likeCount = (int) Math.floor(people / 2);

			people = (likeCount * 3);
			result = result + likeCount;
			n--;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int result = viralAdvertising(n);
		System.out.println(result);
		in.close();
	}
}
