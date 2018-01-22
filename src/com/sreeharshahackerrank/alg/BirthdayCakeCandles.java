package com.sreeharshahackerrank.alg;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles {

	static int birthdayCakeCandles(int n, int[] ar) {
		
		Arrays.sort(ar);
		int tallest=ar[n-1];
		int count=0;
		
		for(int i=0;i<n;i++)
		{
			if(ar[i]==tallest)
			{
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		in.close();
		int result = birthdayCakeCandles(n, ar);
		System.out.println(result);
	}
}
