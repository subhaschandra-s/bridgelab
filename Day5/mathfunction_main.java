package Day5;

import java.util.Scanner;
import Day5.Mathfunction;

public class mathfunction_main 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the decimal value");
	    int n=sc.nextInt();
	    
	    String o=Mathfunction.tobinary(n);
	    System.out.println("binary value is "+o);
	    
	    System.out.println("-------");

		System.out.println("enter the angle in degree");
		int degree=sc.nextInt();
		double radians=Math.toRadians(degree);
		System.out.println("degree to radains "+radians);
		
		double sin=Math.sin(radians);
		System.out.println("sine value is "+sin);
		
		double cos=Math.cos(radians);
		System.out.println("cos value is"+cos);
		
		double m=Mathfunction.todegreesin(sin);
		System.out.println("sine angle is "+m);
		
		double n1=Mathfunction.todegreecos(cos);
		System.out.println("cos angle is "+n1);
		
		System.out.println("++++++++");
		
		
		System.out.println("enter the nth harmonic number");
		int n3=sc.nextInt();
		
		double x=Mathfunction.harmonic(n);
		//System.out.println("total value is"+x);
	}

	
}
