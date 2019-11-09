package Day5;
import java.util.Scanner;
public class static_slope
{
	public static void slope( int x1,int x2,int x3,int y1, int y2,int y3)
	{
		double ab=(y2-y1)/(x2-x1);
		double bc=(y3-y2)/(x3-x2);
		double ac=(y1-y3)/(x1-x3);
	 if(ab==bc||ab==ac||bc==ac)
	 {
		 System.out.println("the Slope is coolinear");
	 }
	 else
	 {
		 System.out.println("The Slope is non colinear");
	 }
	}
	public static void triangle(int x1,int x2,int x3,int y1, int y2,int y3)
	{
		double tr1=((x1-x2)*(y2-y3));
		double tr2=((y1-y2)*(x2-x3));
		double trian=1/2*(tr1-tr2);
		System.out.println(trian);
		if(trian==0)
		{
			System.out.println("The traingle is Collinear");
			
		}
		else
		{
			System.out.println("the Given Triangle is Non Coolinear");
		}
	}
	
public static void main(String[] args) 
{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the points");
		int x1=sc.nextInt();
		System.out.println("Enter the x2 point");
		int x2=sc.nextInt();
		System.out.println("Enter the   x3 point");
		int x3=sc.nextInt();
		
		System.out.println("Enter the y1 points");
		int y1=sc.nextInt();
		System.out.println("Enter the y2 point");
		int y2=sc.nextInt();
		System.out.println("Enter the   y3 point");
		int y3=sc.nextInt();
		System.out.println("The Slope is ");
		slope(x1,x2,x3,y1,y2,y3);	
		System.out.println("The Triangle is ");
		triangle(x1,x2,x3,y1,y2,y3);
	}
}

