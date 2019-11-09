package day2;

import java.util.Scanner;

public class trig 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("generate an angle in degree"); 
	int degree=sc.nextInt();
	double radians=Math.toRadians(degree);
	System.out.println("degree to radians conv is"+radians);
	
    double sin=Math.sin(radians);
    System.out.println("the sin value is"+sin);
   // int angle=(int) Math.toDegrees(sin);
    //System.out.println("sin angle is "+angle);
    
    double cos=Math.cos(radians);
    System.out.println("the cos value is"+cos);
//    int angle2=(int)(Math.toDegrees(cos));
//    System.out.println("cosine angle is "+angle2);
    
}
}
