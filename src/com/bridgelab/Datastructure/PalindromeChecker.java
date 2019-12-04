package com.bridgelab.Datastructure;
import com.bridgelab.Datastructure.Base.Queue;
import com.bridgelab.Utility.utility;

public class PalindromeChecker 
{
   public static void main(String[] args) 
   {
	Queue<Character> q = new Queue<Character>();
		
		System.out.println("Palindrome Checker");
		System.out.println("eneter the word ");
		String word =  utility.readingString();
		char arr[] = word.toCharArray();
		for(char ch : arr) 
		{
		 q.addFront(ch);  
		}
       String str = "";
       for(int i=0;i<arr.length; i++) 
       {
    	   str = str + q.removeFront(); 
       }
       System.out.println(str);
       if(word.equals(str)) 
       {
    	   System.out.println("palindrome");
       }
       else 
       {
    	   System.out.println("not a palidrome");
       }
		
}  
}
