package day3;

//import java.util.Scanner;

public class repeatedno 
{
public static void main(String[] args) 
{
	int ar[]= {40,90,30,40,30,60,70,90};
	for(int i=0;i<ar.length;i++)
	{
		for(int j=i+1;j<ar.length;j++)
		{
			if(ar[i]==ar[j])
				System.out.println(ar[j]);
		}
	}
}
}
