package day2;

import java.util.Scanner;


public class tempconversion
{
public static void main(String[] args) 
{
  Scanner sc=new Scanner(System.in);
   System.out.println("generate the fahrenheit ");
	double f=sc.nextDouble();
	//System.out.println("generate the celsius");
	//double c=sc.nextDouble();
	
	
	double cel=(f-32)*5/9;
	//double f1=(c*9/5)+32;
	
   // System.out.println("fahrenheit value is"+f1);
	System.out.println("celsius value is"+cel);
   
	
}
			}

