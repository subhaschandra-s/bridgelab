package day3;

import java.util.Scanner;

public class primefactor 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	
	for(int i=2;i<=n;i++)
	{
		while(n%i==0)
		{
			System.out.println(i);
			n=n/i;
		}
	}
		
	
	
}
}
