package com.sreeharshahackerrank.alg;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {
	
	static String timeConversion(String s) {
        
		DateFormat readFormat = new SimpleDateFormat( "hh:mm:ssaa");
		DateFormat writeFormat = new SimpleDateFormat( "HH:mm:ss");
		Date date = null;
		String formattedDate=null;
		try {
		    date = readFormat.parse(s);
		} catch (ParseException e) {
		    e.printStackTrace();
		}

		if (date != null) {
		     formattedDate = writeFormat.format(date);
		}
		
		return formattedDate;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        in.close();
        System.out.println(result);
    }

}
