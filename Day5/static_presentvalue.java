package Day5;

import java.util.Scanner;

public class static_presentvalue 
{
static double present_value(double c,double r, int t)
{
	return c/(Math.pow(1+r,t*12));
}

public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the investment amount");
	double c=sc.nextDouble();
	System.out.println("enter the interest of rate");
	double r=sc.nextDouble();
	System.out.println("enter the years");
	int t=sc.nextInt();
	
	r*=0.01;
	
	System.out.println("Years    PresentValue");
	for(int i = 1; i <= t; i++) 
	{
    	int formatter = 19;
	    if (i >= 10) formatter = 18;
		System.out.printf(i + "%"+formatter+".2f\n", present_value(c, r/12, i));
       }
	
	
}
}
