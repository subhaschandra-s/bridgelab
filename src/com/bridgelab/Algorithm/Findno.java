/**
 Author:Subhas
 purpose:function to find the guessed the number
 version:1.2
 Filename:Findno
 Date:19/11/19
 */
package com.bridgelab.Algorithm;
import com.bridgelab.Utility.utility;

public class Findno 
{
public static void main(String[] args) {
	System.out.println("guess a no between 0 to 130");
	utility.readInt();
	try
	{
		System.out.println("guessed no is "+ utility.find());
	}catch(Exception e) {
		System.out.println("enter correct input");
	}
}
}
