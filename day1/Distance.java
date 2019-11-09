package day1;

import java.util.Scanner;

public class Distance 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the x value");
	int x=sc.nextInt();
	System.out.println("enter the y value");
	 int y=sc.nextInt();
	double distance=(Math.sqrt(x*x+y*y));
	System.out.println(distance+" ");
}
}
