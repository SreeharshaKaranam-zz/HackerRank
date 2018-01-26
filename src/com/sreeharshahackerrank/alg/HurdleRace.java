package com.sreeharshahackerrank.alg;

import java.util.Scanner;

public class HurdleRace {

	static int hurdleRace(int k, int[] height) {

		int temp = 0;
		int diff = 0;
		for (int i = 0; i < height.length; i++) {
			if (height[i] > k) {
				
				temp=(height[i]-k);
				if (temp > diff) {
					diff = temp;
				}
			}
		}

		return diff;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] height = new int[n];
		for (int height_i = 0; height_i < n; height_i++) {
			height[height_i] = in.nextInt();
		}
		int result = hurdleRace(k, height);
		System.out.println(result);
		in.close();
	}
}
