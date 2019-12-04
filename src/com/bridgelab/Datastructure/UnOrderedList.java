package com.bridgelab.Datastructure;

import com.bridgelab.Datastructure.Base.LinkedList;
import com.bridgelab.Utility.utility;

public class UnOrderedList 
{
public static void main(String[] args) throws Exception
{
	LinkedList<String> al=new LinkedList <String> ();
	System.out.println("enter the file name");
	String file=utility.readingString();
	System.out.println("enter the word to find");
	String find=utility.readingString();	
	String s[]=utility.readfile(file).split(" ");
	
	for(int i=0;i<s.length;i++)
	{
		al.add(s[i]);
		
	}
	
	if(al.search(s, find))
	{
		al.remove1(find);
	}
	else
	{
		al.add(find);
	}
	
	al.show();
	al.toFile();
}
}
