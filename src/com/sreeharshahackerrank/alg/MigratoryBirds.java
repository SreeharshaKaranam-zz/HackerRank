package com.sreeharshahackerrank.alg;

import java.util.Arrays;
import java.util.Scanner;

public class MigratoryBirds {

	static int migratoryBirds(int n, int[] ar) {
        
		int matchCount=0;
		int tempCount=0;
		int typeVal=0;
		Arrays.sort(ar);
		
		for(int i=0;i<n;i++)
		{
			if(ar[i]==1)
			{
				
			}
		}
		
		return typeVal;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        in.close();
        System.out.println(result);
    }
}
