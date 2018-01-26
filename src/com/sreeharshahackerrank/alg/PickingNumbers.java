package com.sreeharshahackerrank.alg;

import java.util.Arrays;
import java.util.Scanner;

public class PickingNumbers {

	static int pickingNumbers(int[] a) {

		int count=0;
		int max=0;
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				
				if(a[j]-a[i]<=1)
				{
					count++;
				}
			}
			if(count>max)
			{
				max=count;
			}
			count=0;
		}
		
		return max;
				
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int result = pickingNumbers(a);
		System.out.println(result);
		in.close();
	}
}
