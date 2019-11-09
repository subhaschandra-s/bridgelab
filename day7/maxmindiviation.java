package day7;
import java.util.*;
import java.util.Arrays;

public class maxmindiviation
{
	public static double max(double a[],int n)
	{
		double maxvalue=a[0];
		for(int i=1;i<n;i++)
		{
			if(a[i]>maxvalue)
			{
				maxvalue=a[i];
			}
		}
		return maxvalue;
	}
	public static double min(double a[],int n)
	{
		double minvalue=a[0];
		for(int i=1;i<n;i++)
		{
			if(a[i]<minvalue)
			{
				minvalue=a[i];
			}
		}
	return minvalue;
	}
	public static double mean(double a[],int n)
	{
		double sum=0.0;
		double mean1=0.0;
		for(int i=0;i<n;i++)
		sum=sum+a[i];	
		mean1=sum/n;
		System.out.println(sum);
		return mean1;
		
	}
	public static double var(double a[],int n) 
	{
		double avg=mean(a, n);
		double sum=0;for(int i=0;i<n;i++)
		{
			sum += (a[i] - avg) * (a[i] - avg);
        }
        return sum / (n - 1);
    
}
		public static double stddev(double[] a,int n) 
		{
			double x=Math.sqrt(var(a, n));
            return x;
        }
		public static double median(double a[],int n)
		{
			Arrays.sort(a);
		if(n%2==0)
			{
				 double yx=a[n/2];
				
			}
			 double median=(a[(n - 1) / 2] + a[n / 2]) / 2.0;
			return median;
		}
		
	
	public static void main(String[] args)
	{
		double[] a= {600, 470, 170, 430, 300};
		int n=a.length;
		double max=max(a,n);
		System.out.println("the maximum value is "+ max);
		double min=min(a,n);
		System.out.println("The min value is " +min);
		double mean=mean(a,n);
		System.out.println("the mean is " +mean);
		double var=var(a,n);
		System.out.println("the variance is " +var);
		double stddev=stddev(a,n);
		System.out.println("the standard deviation is " +stddev);
		double median=median(a,n);
		System.out.println("the median is "+median);
		
	}
}




