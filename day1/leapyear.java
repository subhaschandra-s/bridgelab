package day1;

import java.util.Scanner;

public class leapyear 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no");
	int n=sc.nextInt();
	if(n<=1582)
		System.out.println("please enter the n value above or equal to 1582");
	
	else if(n%400==0||n%4==0&&n%100!=0)
	{
		System.out.println(n+" is leap year");
	}
	
	else
	{
		System.out.println(n+" is not a leap year");
}
}
}
