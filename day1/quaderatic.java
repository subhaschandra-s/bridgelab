package day1;
import java.util.Scanner;

public class quaderatic 
{
   static void quadratic(double a,double b,double c)
		{
		double delta=(b*b-4*a*c);
		if(delta<0)
		{
			System.out.println("take one value  negative imaginary");
		}
		
		else
		{
			double x=(-b + Math.sqrt(delta))/(2*a);
			double y=(-b -Math.sqrt(delta))/(2*a);
			System.out.println("x=" +x);
			System.out.println("y=" +y);
		}
		
	}
		 
		
		public static void main(String arg[])
		 {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Ente the value of a,b,c");
		   double a=sc.nextDouble();
		   double b=sc.nextDouble();
		   double c= sc.nextDouble();
		   quadratic(a ,b,c);
		   
		 }
	

	
}

