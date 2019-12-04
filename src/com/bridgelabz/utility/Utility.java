package com.bridgelabz.utility;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

import com.bridgelabz.controller.AddressBookController;

import java.util.Random;

public class Utility 
{
	 static Scanner sc ;
	 static Random random;
		static String inputString ="";
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
	
	public static String getString(boolean details) 
	{
		inputString = "";
		while (inputString.equals("")) {
			sc.reset();
			inputString = sc.nextLine();
			if (!details) {
				if (!Pattern.matches("\\D*[^\\s]", inputString)) {
					System.out.println("Please enter valid String");
					AddressBookController.addUser();
					inputString = "";
				}
			}
		}
		return inputString;
	}
	public static boolean stringChecker(String str) {
		char[] ch = str.toCharArray();
		String temp = "";
		Predicate<Character> p = s -> s >= 97 && s <= 122 || s >= 65 && s <= 90 || s >= 48 && s <= 57;
		for (char i : ch) {
			if (p.test(i)) {
				return true;
			}
		}
		return false;
	}
}
