/**
 Author:Subhas
 purpose:function to find Tripplets
 version:1.2
 Filename:Tripplets
 Date:19/11/19
 */
package com.bridgelab.Functional;

import com.bridgelab.Utility.utility;

public class Tripplets
{
public static void main(String[] args)
{
	System.out.println("Enter the size of array");
	int size = utility.readInt();
	int[] array = new int[size];
	System.out.println("Enter " + size + " numbers in array");
	for (int i = 0; i < size; i++) 
	{
		array[i] =utility.readInt();
	}
	int count = utility.triplets(array);
	if (count == 0) 
	{
		System.out.println("No distinct triplets found");
	} else {
		System.out.println("Total distinct triplets = "+count);
	}
}
}

