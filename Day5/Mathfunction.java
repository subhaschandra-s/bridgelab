package Day5;

import java.util.Scanner;

public class Mathfunction
{
	static String tobinary(int n)
	 {
		 String bin="";
		 
		 while(n>0)
		 {
		   int r=n%2;
		   bin=r+bin;
		   n=n/2;
		 }
		  return bin;
	 }
	
	static double todegreesin(double sin)
	{
		double x=Math.toDegrees(sin);
		return x;
		
	}
	
	static double todegreecos(double cos)
	{
		double y=Math.toDegrees(cos);
		return y;
	}
	
	 static double harmonic(int n)
	{
		double sum=0.0;
		
				
		for(int i=1;i<=n;i++)
		{
			sum =1.0/i;
			System.out.println(" harmonic values is"+sum);
			
		}
		return sum;
		
	}
	

}
