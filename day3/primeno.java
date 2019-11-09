package day3;

import java.util.Scanner;

public class primeno 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the range ");
	int n=sc.nextInt();
	for(int i=1;i<n;i++)
	{
		boolean isPrime=true;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
				isPrime=false;
			 break;
		}
		if(isPrime)
			System.out.println(i+"--->prime number");
	}
}
 
}

