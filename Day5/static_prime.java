package Day5;

import java.util.Scanner;

public class static_prime
{
	static boolean isPrime(int n)
	{
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				return false;
		     }
			
		}
		return true;
}
	
public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int n=sc.nextInt();
		
		boolean z=isPrime(n);
		System.out.println(z);
	   
		

	}

}
