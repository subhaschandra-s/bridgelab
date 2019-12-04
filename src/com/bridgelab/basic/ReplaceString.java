/**
 Author:Subhas
 purpose:function to replace the name with fullname
 version:1.2
 Filename:ReplaceString
 Date:19/11/19
 */
package com.bridgelab.basic;
import com.bridgelab.Utility.utility;

public class ReplaceString 
{
public static void main(String[] args) 
{
	System.out.println("enter the user name");
	String s=utility.readString();
    utility.replace(s);
	
}
}
