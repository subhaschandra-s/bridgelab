package com.bridgelabz.Utility;

import java.util.Scanner;
import java.util.Random;

public class Utility 
{
	 static Scanner sc ;
	 static Random random;
		
		static
		{  
			sc= new Scanner(System.in);
			random=new Random();
			
		}
	/**
	 Accessing the Integer value from Scanner..
	 @returns integer value..
	 */
	public static int  readInt()
	{
		return sc.nextInt();
	}
	/**
	 Accessing the double value from Scanner..
	 @returns double value..
	 */
	public static double readDouble()
	{
		return sc.nextDouble();
	}
	
	public static long readLong()
	{
		return sc.nextLong();
	}
 /**
   Accessing the String value from Scanner..
   @returns String value..
*/	
	public static String readString()
	{
		return sc.nextLine();
	}
	public static String readingString()
	{
		return sc.next();
	}
	
	public static void quit() 
	{
		
		System.exit(0);
	}
	
	public static String patientId() 
	{
		String output = "";
	    String doctorId = "PAT";
	    for (int i = 0 ; i < 3 ; i++){
	        output+=random.nextInt(10);
	    }
	    int outputInt = Integer.parseInt(output);
	    return doctorId+=outputInt;
	}
	
	public static String doctorId()
	{
		String output = "";
	    String doctorId = "DOC";
	    for (int i = 0 ; i < 3 ; i++){
	        output+=random.nextInt(10);
	    }
	    int outputInt = Integer.parseInt(output);
	    return doctorId+=outputInt;	
	}
	
	public static boolean mobileNumberValidator(String number) {
		if(number.matches("^[789]\\d{9}$")) {
			return true;
		}
		return false;
	}
	public static boolean isStringOnlyAlphabet(String str) 
	{
		return ((str != null) 
                && (!str.equals("")) 
                && (str.matches("^[a-zA-Z]*$"))); 	
	}
	
}
