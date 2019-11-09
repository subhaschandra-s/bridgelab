package day1;

import java.util.Scanner;

public class Springseason 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the month");
	int month=sc.nextInt();
	System.out.println("enter the day");
	int day=sc.nextInt();
	
	boolean isSpring=(month==3 &&  day>=20 && day<=31)
			         ||(month==4 && day >=1 && day<=30)
			         ||(month==5 && day >=1 && day<=31)
			         ||(month==6 && day >=1 && day<=20);
	
	System.out.println(isSpring);
			
	
	
}
}
