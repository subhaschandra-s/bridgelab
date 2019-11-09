package day2;

import java.util.Scanner;

public class flipcoin 
{
	public static void flipPerc(int times)
	{
		double heads=0;
		for(int i=0;i<times;i++)
		{
			if(Math.random()> 0.5)
			{
				heads++;
			}
		}
		System.out.println("heads percentage is"+(double)(heads/times)*100);
		System.out.println("tails percentage is"+(double)(100-(heads/times)*100));
	}
  public static void main(String[] args) 
{
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the no of times to flip a coin");
  int times=sc.nextInt();
  flipPerc(times);
}
}
