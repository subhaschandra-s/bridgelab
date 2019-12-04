/**
 Author:Subhas
 purpose:function to do windChill
 version:1.2
 Filename:Windchill
 Date:19/11/19
 */
package com.bridgelab.Functional;

import com.bridgelab.Utility.utility;

public class Windchill 
{
public static void main(String[] args) 
{
	System.out.println("enter the temp value");
	double t=utility.readInt();
	System.out.println("enter the velocity value");
	double v=utility.readInt();
	
	double w=0;
	if(t>50||v>120||v<3)
	{
		System.out.println("out of range");
		
	}
	else
	{
		w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
	}
	System.out.println("the wind chill is "+w);
}
}

