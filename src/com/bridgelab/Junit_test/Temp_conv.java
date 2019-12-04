/**
 Author:Subhas
 purpose:function to get celsius or temp value
 version:1.2
 Filename:Temp-conv
 Date:19/11/19
 */
package com.bridgelab.Junit_test;

import com.bridgelab.Utility.utility;

public class Temp_conv
{
public static void main(String[] args) 
{
	System.out.println("enter the temperature value");
	double t=utility.readDouble();
	utility.getcelsius(t);
}
}
