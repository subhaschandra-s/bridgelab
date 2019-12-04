/**
 Author:Subhas
 purpose:function to find Monthly payment
 version:1.2
 Filename:Monthly_payment
 Date:19/11/19
 */

package com.bridgelab.Junit_test;

import com.bridgelab.Utility.utility;

public class Monthly_payment 
{
public static void main(String[] args)
{
	System.out.println("enter the price");
	int P=utility.readInt();
	System.out.println("enter the years");
	int Y=utility.readInt();
	System.out.println("enter the rate of interest");
    double R=utility.readInt();
    
    utility.getmonthpayment(P,Y,R);
    
}
}
