/**
 Author:Subhas
 purpose:function to do decimal to binary
 version:1.2
 Filename:Tobin
 Date:19/11/19
 */
package com.bridgelab.Junit_test;

import com.bridgelab.Utility.utility;

public class Tobin 
{
public static void main(String[] args) 
{
	System.out.println("enter the decimal no");
	int n=utility.readInt();
	String x=utility.tobinaryString(n);
	System.out.println("binary value is "+x);
}
}
