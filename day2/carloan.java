package day2;

import java.util.Scanner;

public class carloan
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the price");
	int P=sc.nextInt();
	System.out.println("enter the years");
	int Y=sc.nextInt();
	System.out.println("enter the rate of interest");
    double R=sc.nextDouble();
    
    int n=12*Y;
    double r=R/(12*100);
    
    double payment=P*r/(1-Math.pow(1+r, -n));
    System.out.println("monthly payment is-->"+payment);

}
}
