package day2;

import java.util.Scanner;

public class harmonic
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the nth harmonic number");
	int n=sc.nextInt();
	double sum=0.0;
	double s=0;
	
	for(int i=1;i<=n;i++)
	{
		sum =1.0/i;
		System.out.println(" harmonic values is"+sum);
	
	 s= sum+s;
		}
	System.out.println("total"+s);
	
	
}
}
