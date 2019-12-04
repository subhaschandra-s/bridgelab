/**
 Author:Subhas
 purpose:function to get the returned amount through counting the amounts
 version:1.2
 Filename:vending_machine
 Date:19/11/19
 */
package com.bridgelab.Junit_test;

import com.bridgelab.Utility.utility;

public class vending_machine 
{
	public static void main(String[] args) 
	{	
		
		int[] notes = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };
    	System.out.println("Enter the Amount to be withdrawl");
		int totalAmount = utility.readInt();
		int[] notesCount=utility.getNotes(totalAmount);
		
		for (int i = 0; i < notes.length; i++) {
			System.out.println(notes[i] + " notes : " + notesCount[i]);
		}
	}
}
