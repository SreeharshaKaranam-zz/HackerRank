package com.sreeharshahackerrank.alg;

import java.util.Scanner;

public class CountingValleys {

	static int countingValleys(int n, String s) {

		char[] stepChars = s.toCharArray();
		boolean valleyFlag = false;
		boolean mountainFlag = false;
		int sealevel = 0;
		int mountainCount = 0;
		int valleyCount = 0;
		for (int i = 0; i < stepChars.length; i++) {
			if ((stepChars[i] == 'U') && sealevel == 0)
				mountainFlag = true;
			else if (((stepChars[i] == 'D') && sealevel == 0))
				valleyFlag = true;

			if (mountainFlag) {
				if ((stepChars[i] == 'U'))
					sealevel++;
				else if (stepChars[i] == 'D')
					sealevel--;

				if (sealevel <= 0) {
					mountainFlag = false;
					mountainCount++;

				}

			}
			/** Entering in to the valley **/
			else if (valleyFlag) {
				if ((stepChars[i] == 'D'))
					sealevel--;
				else if (stepChars[i] == 'U')
					sealevel++;

				if (sealevel >= 0) {
					valleyFlag = false;
					valleyCount++;

				}

			}

		}

		return valleyCount;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int result = countingValleys(n, s);
		System.out.println(result);
		in.close();
	}

}
