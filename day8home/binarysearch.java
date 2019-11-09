package day8home;
import java.util.Scanner;

public class binarysearch
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find index");
		int[] a = {2,5,7,9,14,16,17,19,20,24,28};
		int ser = sc.nextInt();
		
		int li = 0;
		int hi = a.length-1;
		int mi = (li+hi)/2;
		
		while(li <= hi)
		{
			if(a[mi] == ser)
			{
				System.out.println("Element is at "+mi+" index position");
				break;
			}
			else
			{
				if(a[mi] < ser)
				{
					li = mi+1;
				}
				else
				{
					hi = mi-1;
				}
				mi = (li+hi)/2;
			}
		}
		if(li>hi)
		{
			System.out.println("Element not present in series");
		}
		
		
	}
}
