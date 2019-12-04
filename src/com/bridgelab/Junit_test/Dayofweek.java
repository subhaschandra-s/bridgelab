/**
 Author:Subhas
 purpose:function to find day of the week
 version:1.2
 Filename:Dayofweek
 Date:19/11/19
 */
package com.bridgelab.Junit_test;

import com.bridgelab.Utility.utility;
public class Dayofweek 
{
public static void main(String[] args) 
{
	System.out.println("enter the day, month, and year");
	int dd=utility.readInt();
	int mm=utility.readInt();
	int yy=utility.readInt();
	
	utility.dayofweek(dd,mm,yy);
	
}
}
