package day1;

import java.util.Scanner;
class error1
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter two no");

int a=sc.nextInt();
int b=sc.nextInt();
try
{
int sum=a/b;
System.out.println(sum);
}
catch(ArithmeticException e)
{
System.out.println(e);
//System.out.println("second no must not be zero");
}
System.out.println("thank you");
}
}
