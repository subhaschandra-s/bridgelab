package day2;

import java.util.Scanner;

public class powerof2 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the power no");
	int  n=sc.nextInt();
	int power=1;
	
	for(int i=1;i<=n;i++)
	{
		power=2*power;
	System.out.println(2+"^"+i+"=" +power);
		
	}
}
}
