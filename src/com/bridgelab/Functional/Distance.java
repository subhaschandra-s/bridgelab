/**
 Author:Subhas
 purpose:function to find the distance using formula
 version:1.2
 Filename:distance
 Date:19/11/19
 */
package com.bridgelab.Functional;

import com.bridgelab.Utility.utility;

public class Distance 
{
public static void main(String[] args) 
{
	System.out.println("enter the x value");
	int x=utility.readInt();
	System.out.println("enter the y value");
	 int y=utility.readInt();
	double distance=(Math.sqrt(x*x+y*y));
	System.out.println(distance+" ");
}
}

