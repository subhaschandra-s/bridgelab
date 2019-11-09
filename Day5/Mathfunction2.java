package Day5;

import java.util.Scanner;

public class Mathfunction2 
{
	
	public static double squrt1(double c)
		{
			double sqt=Math.sqrt(c);
			System.out.println("the sqrt value is "+sqt);
			
		return sqt;
		}
	
	
		public static double squrt1(double c,double epsilon)
		{
			 
	        double t=c;
			while(Math.abs(t-c/t) > epsilon*t)
			{
				t=(c/t+t)/2.0;
			}
			
			return t;
		}
			
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value to find sqrt");
			double c=sc.nextDouble();
			squrt1(c);
			
			
			System.out.println();
			double epsilon = 1e-15;
			
			double x=squrt1(c,epsilon);
			System.out.println(x);
		}
		}




