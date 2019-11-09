package day1;

import java.util.Scanner;

public class operator2 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the a,b,c values");
	double a=sc.nextDouble();
	double b=sc.nextDouble();
	double c=sc.nextDouble();
	
	double x=(a+b*c);
	double y=(a*b+c);
	double z=(c+a/b);
	double m=(a%b+c);
	System.out.println(x+" ");
	System.out.println(y+" ");
	System.out.println(z+" ");
	System.out.println(m+" ");
	
}

}
