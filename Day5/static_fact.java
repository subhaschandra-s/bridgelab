package Day5;

import java.util.Scanner;

public class static_fact
{

	public static long factorial(int n)
	{
	
		int fact=1;
		
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int n=sc.nextInt();
		
		long m=factorial(n);
		System.out.println(m);
		
	}

}
