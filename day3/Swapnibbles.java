package day3;
import java.util.Scanner;
import day3.dec2bin;

public class Swapnibbles
{
	public static String swapNibble(String s) 
	{
		char[] c = s.toCharArray();
		String swapedNibbles = "";
		if (c.length < 8) 
		{
			int count = 8 - c.length;
			while (count > 0)
			{
				swapedNibbles += "0";
				count--;
			}
			
		}
		
		for (int i = 0; i < c.length; i++)
		{
			swapedNibbles += c[i];
		}
		System.out.println(swapedNibbles);
		c = swapedNibbles.toCharArray();
		
		swapedNibbles = "";
		System.out.println(swapedNibbles);
		
		for (int i = c.length / 2; i < c.length; i++)
		{

			swapedNibbles = swapedNibbles + c[i];
		}
		System.out.println(swapedNibbles);
		
		for (int i = 0; i < (c.length / 2); i++)
		{
			swapedNibbles = swapedNibbles + c[i];
		}
		return swapedNibbles;
	}
	
	public static int binaryToDecimal(String x) 
	{
		int sum = 0, p = 0;  
		for (int i = x.length() - 1; i >= 0; i--)
		{

			if (x.charAt(i) == '1')
			{
				sum = (int) (sum + Math.pow(2, p));
			}
			p++;
		}
		return sum;
	}
	

public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	
	String s=dec2bin.tobinaryString(sc.nextInt());
	System.out.println(s);
	
	String x=swapNibble(s);
	System.out.println(x);
 
int z=	binaryToDecimal(x);
System.out.println(z);
}
}