package com.sreeharshahackerrank.alg;

import java.util.Scanner;

public class Solve {
	

    static String solve(int year){
       double leapYear=(year%4);
       double hundivisible=(year%100);
       double fourhundivisible=(year%400);
       String programmerdayleap="12.09"+"."+year;
       String programmerdaynonleap="13.09"+"."+year;
       String programmerday1918="26.09"+"."+year;
       if(year==1918)
       {
    	   return programmerday1918;
       }
       else if(((leapYear==0 && hundivisible!=0) || (fourhundivisible==0)) && year>1918)
       {
    	   return programmerdayleap;
       }
       else if(leapYear==0 && year<=1917)
       {
    	   return programmerdayleap;
       }
       else if(leapYear!=0 && year<=1917)
       {
    	   return programmerdaynonleap;
       }
       else
       {
    	   return programmerdaynonleap;
       }
    	
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        in.close();
        System.out.println(result);
    }

}
