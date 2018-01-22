package com.sreeharshahackerrank.alg;

import java.util.Arrays;
import java.util.Scanner;

public class SockMerchant {
	
	 static int sockMerchant(int n, int[] ar) {
		 
		Arrays.sort(ar);
		int count=0;
		int matchVal=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
				}
				
			}
			matchVal=(int) (matchVal+Math.ceil(count/2));
			i=i+(count-1);
			count=0;
			
		}
		
		return matchVal;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] ar = new int[n];
	        for(int ar_i = 0; ar_i < n; ar_i++){
	            ar[ar_i] = in.nextInt();
	        }
	        int result = sockMerchant(n, ar);
	        in.close();
	        System.out.println(result);
	    }

}
