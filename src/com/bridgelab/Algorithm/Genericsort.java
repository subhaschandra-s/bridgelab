/**
 Author:Subhas
 purpose:function to do Genericsort for search and sort programs
 version:1.2
 Filename:Genericsort
 Date:19/11/19
 */
package com.bridgelab.Algorithm;
import com.bridgelab.Utility.utility;

public class Genericsort {
	public static void main(String[] args) {
		System.out.println("enter value of n");
		int n=utility.readInt();
		Integer a[]=new Integer[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the element");
			a[i]=utility.readInt();
			
		}
        utility.genericSort(a);
        for(int i=0;i<n;i++)
        {
        	System.out.print(a[i]+" ");
        }
        
	
}
}

	