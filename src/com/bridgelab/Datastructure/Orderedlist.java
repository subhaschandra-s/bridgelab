package com.bridgelab.Datastructure;

import com.bridgelab.Datastructure.Base.LinkedList;
import com.bridgelab.Utility.utility;

public class Orderedlist
{
public static void main(String[] args) throws Exception 
{
	LinkedList<Integer> al=new LinkedList<Integer>();
	String file;
	Integer find;
	System.out.println("Enter the file name");
	file=utility.readingString();

	String[] s=utility.readfile(file).split(",");

	  Integer[] arr=new Integer[s.length];
	  for(int i=0;i<s.length;i++)
	  {
         arr[i]=Integer.parseInt(s[i]); 
       }
	  System.out.println("Enter a number to find");
	  find=utility.readInt();
	  utility.genericSort(arr);
	   
	    for(int j=0;j<arr.length;j++)
	    {
	    al.add(arr[j]);
	    }
	        if(al.search(arr, find)) 
	        {
	           al.remove1(find);
	          }
	        else
	       {
	        al.addAt(find,al.orderIndex(find));
	      }
	   al.show();
	   al.toFile();
	   
}
}