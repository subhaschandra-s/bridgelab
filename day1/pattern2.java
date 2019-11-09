package day1;

import java.util.Scanner;

public class pattern2 
{
	
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the characters");
			char ch = sc.next().charAt(0);
			int n = 10;
			
			if(ch == 'k')
			{
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<n; j++)
				{
					if(j==0 || i+j==n/2 || i-j==n/2)
					{
						System.out.print("**");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			}
			else
			{
			  if(ch == 'd')
			  {
				  for(int i=0; i<n; i++)
					{
						System.out.print("*");
					}	
					System.out.println();
					for(int i=0; i<n; i++)
					{	
					   System.out.println("**       **");  
					}
					for(int i=0; i<n; i++)
					{
						System.out.print("*");
					}
			   }
			  else
			  {
				 if(ch == 'w') 
				 {
					 for(int i=0; i<n; i++)
						{
							for(int j=0; j<i; j++)
							{
								System.out.print(" ");
							}
							System.out.print("**");
							for(int j=i; j<n; j++)
							{
								System.out.print(" ");
							}
							for(int j=i; j<n-1; j++)
							{
								System.out.print(" ");
							}
							System.out.print("**");
							for(int j=0; j<i; j++)
							{
								System.out.print(" ");
							}
							for(int j=1; j<i; j++)
							{
								System.out.print(" ");
							}
							System.out.print("**");
							for(int j=i; j<n; j++)
							{
								System.out.print(" ");
							}
							for(int j=i; j<n-1; j++)
							{
								System.out.print(" ");
							}
							System.out.print("**");
							System.out.println();
						}
				 }
				 else
				 {
					 System.out.print("wrong Input"); 
				 }
			  }
			}
			

		}

	}


