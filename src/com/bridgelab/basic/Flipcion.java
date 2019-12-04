/**
 Author:Subhas
 purpose:function to flip coin using random function
 version:1.2
 Filename:Flipcoin
 Date:19/11/19
 */

package com.bridgelab.basic;

import com.bridgelab.Utility.utility;

public class Flipcion 
{
	public static void main(String[] args) 
	{
	  System.out.println("enter the no of times to flip a coin");
	  int times=utility.readInt();
	 utility.flipPerc(times);
	}
}
