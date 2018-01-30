package com.sreeharshahackerrank.alg;

import java.util.Scanner;

public class UtopianTree {


    static int utopianTree(int n) {
     
    	int temp=1;
    	int tempheight=1;
    	
    	while(temp<=n)
    	{
    		if(temp%2!=0)
    		{
    			tempheight=tempheight*2;
    		}
    		else if(temp%2==0)
    		{
    			tempheight++;
    		}
    		temp++;
    	
    	}
    	if(n==0)
    		tempheight=1;
    	return tempheight;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int result = utopianTree(n);
            System.out.println(result);
        }
        in.close();
    }
}
