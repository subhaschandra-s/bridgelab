/**
 Author:Subhas
 purpose:function to do for Quadratic functions
 version:1.2
 Filename:Quadratic
 Date:19/11/19
 */
package com.bridgelab.Functional;

import com.bridgelab.Utility.utility;

public class Quadratic 
{
public static void main(String[] args) 
{
	System.out.println("Ente the value of a,b,c");
	   double a=utility.readDouble();
	   double b=utility.readDouble();
	   double c= utility.readDouble();
	   utility.quadratic(a ,b,c);
}
}
