/**
 Author:Subhas
 purpose:function to check the leap year
 version:1.2
 Filename:leapyear
 Date:19/11/19
 */
package com.bridgelab.basic;

import com.bridgelab.Utility.utility;

public class leapyear
{
public static boolean isleap(int year) 
{
	return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
}
public static void main(String[] args) 
{	try {
	System.out.println("enter year in 4 digit");
	int year = utility.readInt();
	/*
	 * ensures the value is 4 digit
	 */
	while (year < 999 || year > 9999) {
		System.out.println("wrong input");
		System.out.println("enter year in 4 digit");
		year = utility.readInt();
	}
	if (isleap(year)) {
		System.out.println(year + " is a leap year");
	} else
		System.out.println(year + " is not a leap year");
 
}
catch (Exception e) {
	System.out.println(e + " Enter valid input");
}
		
}
}
