package day3;

import java.util.Scanner;

public class dec2bin 
{
  static String tobinaryString (int n)
	{
	 String bin="";
	
	 while(n>0)
	{
		int r=n%2;
		bin=r+bin;
		n=n/2;
		
	}
	 return bin;
	}

  

public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the decimal no");
	int n=sc.nextInt();
	String s=(tobinaryString(n));
	System.out.println("binary value is "+s);
		
}
}



