package com.sreeharshahackerrank.alg;

import java.util.Scanner;

public class MiniMaxSum {


    static void miniMaxSum(int[] arr) {
        long maxCount = 0;
		long minCount = 0;
		long count = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					count = count + arr[j];
				}
			}
			if (i == 0) {
				minCount = count;
				maxCount = count;
			} else {
				if (count < minCount) {
					minCount = count;
				} else if (count > maxCount) {
					maxCount = count;
				}
			}
			count=0;
		}

		System.out.println(minCount+" "+maxCount);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
