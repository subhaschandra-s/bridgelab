/**
 Author:Subhas
 purpose:function to find harmonic numbers
 version:1.2
 Filename:Harmonic
 Date:19/11/19
 */
package com.bridgelab.basic;

import com.bridgelab.Utility.utility;

public class Harmonicno 
{
public static void main(String[] args) 
{
	System.out.println("enter the nth harmonic no");
	int n=utility.readInt();
	utility.harmonic(n);
}
}
