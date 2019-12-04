/**
 Author:Subhas
 purpose:function to find the prime factors
 version:1.2
 Filename:prime factor
 Date:19/11/19
 */
package com.bridgelab.basic;

import com.bridgelab.Utility.utility;

public class primefactor
{
public static void main(String[] args) 
{	
	System.out.println("enter the no to find prime factors");
	int n=utility.readInt();
	utility.primefact(n);
}
}
