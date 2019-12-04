package com.bridgelabz.Inventory;

import java.io.FileWriter;


import org.json.JSONArray;
import org.json.JSONObject;

import com.bridgelabz.utility.Utility;


public class Inventory 
{
@SuppressWarnings("unchecked")
public static String Json() throws Exception 
{	@SuppressWarnings("unused")
	JSONArray arr=new JSONArray();
	System.out.println("enter the inventory limit");
	int items=Utility.readInt();
	for(int i=0;i<items;i++)
	{
		JSONObject obj=new JSONObject();
		System.out.println("enter the inventory name");
		obj.put("Name",Utility.readingString());
		System.out.println("enter the inventory price");
		obj.put("Price", Utility.readDouble());
		System.out.println("enter the inventory weight");
		obj.put("weight", Utility.readInt());
		arr.put(obj);	
	}
	try
	{
		System.out.println("enter the file name");
		String file=Utility.readingString();
		FileWriter fr=new FileWriter(file);
		fr.write(arr.toString());
    	fr.flush();
	}
	catch(Exception e)
	{
		e.printStackTrace();	
	}
	return null;
	}
public static void main(String[] args) throws Exception 
{
	String x=Inventory.Json();
}
}

