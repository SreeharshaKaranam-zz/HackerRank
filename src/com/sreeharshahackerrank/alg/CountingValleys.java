package com.sreeharshahackerrank.alg;

import java.util.Scanner;

public class CountingValleys {

	static int countingValleys(int n, String s) {

		char[] stepChars = s.toCharArray();
		int upCount = 0;
		int downCount = 0;
		boolean valleyFlag = false;
		System.out.println(stepChars.length);
		System.out.println(stepChars[0]);

		int i=0;
		while(i==(n-1))
		{
			if(stepChars[i]=='D')
			{
				
			}
			
		}

		return 1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int result = countingValleys(n, s);
		// System.out.println(result);
		in.close();
	}

}
