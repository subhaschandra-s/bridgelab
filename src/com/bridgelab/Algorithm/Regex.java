/**
 Author:Subhas
 purpose:function to do Regex program
 version:1.2
 Filename:Regex
 Date:19/11/19
 */
package com.bridgelab.Algorithm;

import java.sql.Date;

import com.bridgelab.Utility.utility;

public class Regex 
{
	public static void main(String[] args) {
		UserDetails user1=new UserDetails();
		System.out.println("enter the first name");
		String msg="hello <<name>>,we have your <<fullname>> in our system.your contact number is 91-xxxxxxxxxx.please let us know in case of any clarification,ThankYou bridgelabz xx/xx/xxxx";
		user1.setfName(utility.readString());               //getting user first name
		System.out.println("enter the full name");
		user1.setlName(utility.readString());             //getting user last name
		System.out.println("enter the mobile number");
		user1.setmobileNo(utility.readString());       //getting user contact
		user1.setdate(utility.GetFormatedDate(new Date(20)));   //getting current date
		   
		System.out.println(utility.ConvertString(user1, msg));
		}
}
