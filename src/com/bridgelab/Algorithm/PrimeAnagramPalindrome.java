/**
 Author:Subhas

 purpose:function to find the prime anagram and prime Palindrome
 version:1.2
 Filename:PrimeAnagramPalindrome
 Date:19/11/19
 */
package com.bridgelab.Algorithm;

import com.bridgelab.Utility.utility;

public class PrimeAnagramPalindrome
{
public static void main(String[] args) 
{
	System.out.println("Enter the Range");
	int n = utility.readInt();
	utility.isPrime(n);
	utility.primePalindrome();
	
	 utility.primeanagram();
	
}
}

