package day4;

import java.util.Scanner;

public class arrays
{
	
		  public void same(String str1, String str2)
		  {
			 char[] arr1 = str1.toCharArray();
			 char[] arr2 = str2.toCharArray();
			 
			 int a = 0;
			 for(int i=0; i<arr1.length; i++)
			 {
				 if(arr1[i] == arr2[i])
				 {
					 continue;
				 }
				 else
				 {
					 a++;
				 }
			 }
			 if(a>0)
			 {
				 System.out.println("Arrays are  not equals");
			 }
			 else
			 {
				 System.out.println("Arrays are equals"); 
			 }
			 
			
		  }
		  
		
	      public static void main(String args[])
	      {
	    	  arrays p5 = new arrays();
	    	  Scanner sc = new Scanner(System.in);
	    	  
	    	  System.out.println("Enter the First String");
	    	  String s1 = sc.nextLine();
	    	  
	    	  System.out.println("Enter the second String");
	    	  String s2 = sc.nextLine();
	    	  
	    	s1 = s1.toUpperCase();
	    	s2 = s2.toUpperCase();
	    	
	    	  p5.same(s1,s2);
	      }
	}


