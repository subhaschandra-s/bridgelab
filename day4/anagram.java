package day4;

import java.util.Arrays;
import java.util.Scanner;

public class anagram 
{
	
	static boolean  anagram(String s1,String s2)
	{
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		s1=s1.replace(" ","");
		s2=s2.replace(" ","");
		
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2))
		{
		return true;
		
		}
		else
		{
			return false;
		}
	}
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two string");
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	
	boolean s3=anagram(s1, s2);
	System.out.println(s3);
	
	
		}
}
