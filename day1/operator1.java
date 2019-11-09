package day1;

import java.util.Scanner;

public class operator1 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the a,b,c values");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	
	int x=(a+b*c);
	int y=(a*b+c);
	int z=(c+a/b);
	int m=(a%b+c);
	System.out.println(x+" ");
	System.out.println(y+" ");
	System.out.println(z+" ");
	System.out.println(m+" ");
	
}
}
