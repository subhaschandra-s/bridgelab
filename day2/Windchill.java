package day2;

import java.util.Scanner;

public class Windchill 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the temp value");
	double t=sc.nextDouble();
	System.out.println("enter the velocity value");
	double v=sc.nextDouble();
	double w=0;
	if(t>50||v>120||v<3)
	{
		System.out.println("out of range");
		
	}
	else
	{
		w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
	}
	System.out.println("the wind chill is"+w);
}
}
