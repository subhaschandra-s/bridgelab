/**
 Author:Subhas
 purpose:function to Swap the nibbles
 version:1.2
 Filename:SwapNibbles
 Date:19/11/19
 */
package com.bridgelab.Junit_test;

import com.bridgelab.Utility.utility;

public class SwapNibbles 
{
public static void main(String[] args) 
{
System.out.println("enter the  decimal number");
	
	String s=utility.tobinaryString(utility.readInt());
	System.out.println(s); 		//binary values...
	
	String x=utility.swapNibble(s);
	System.out.println(x);   //swapped binary values..
 
int z=utility.binaryToDecimal(x); //to get decimal value..
System.out.println(z);
}
}
