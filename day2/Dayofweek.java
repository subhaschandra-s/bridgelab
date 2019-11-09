package day2;

import java.util.Scanner;

public class Dayofweek 
{
	
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter the day, month, and year");
			int dd=sc.nextInt();
			int mm=sc.nextInt();
			int yy=sc.nextInt();
			
			int y=yy-(14-mm)/12;
			int x=y+y/4-y/100+y/400;
			int m=mm+12*((14-mm)/12)-2;
			int d=(dd+x+((31*m)/12))% 7;
			//System.out.println(d);
			
			String a[]= {"sunday","monday","tuesday","wednesday","tursday","friday","saturday"};
			System.out.println(a[d]);
			String b[]= {"0","jan","feb","mar","april","may","june","july","aug","sep","oct","nov","dec"};
			System.out.println("month--- "+b[mm]);
		}

}
