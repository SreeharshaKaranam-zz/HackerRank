package com.sreeharshahackerrank.alg;

import java.util.Scanner;

public class DrawingBook {

	static int solve(int n, int p) {

		long frontCount = 0;
		long backCount = 0;

		for (int i = 1; i <= n; i++) {

			if (i == p && i==1)
			{
			break;
			}
			else if((p==i+1) && (i==1))
			{
				frontCount++;
				break;
				
			}

			if (i <= p) {
				frontCount++;
			}

		}
		for (int i = n; i > 0; i--) {
			if ((i == (p + 1)) && (p % 2 == 0) && (i==n || i==n-1)) {
				break;
			}
			if (i >p) {
				backCount++;
			}

		}

		if (frontCount < backCount) {
			if (p == 1 || (p == 2))
				return (int) (frontCount);
			else
				return (int) Math.ceil(frontCount / 2);
		} else {
			if (p == n || ((p == n - 1) || ((p == n - 2))))
				return (int) (backCount);
			else
				return (int) Math.ceil(backCount / 2);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = in.nextInt();
		int result = solve(n, p);
		in.close();
		System.out.println(result);
	}
}
