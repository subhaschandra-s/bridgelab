package com.bridgelab.utility;

import java.util.Scanner;

public class Utility 
{
	 static Scanner sc ;
		
		static
		{  
			sc= new Scanner(System.in);
			
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
}
