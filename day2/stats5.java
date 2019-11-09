package day2;

public class stats5 
{
public static void main(String[] args) 
{
	int n=5;
	double x=Math.random();
	double max=x;
	double min=x;
	double average=x;
	
	while(n>0)
	{
		x=Math.random();
		System.out.println(x);
		max=Math.max(x, max);
		min=Math.min(x, min);
		average=average+x;
		n--;
	}
	System.out.println("max: "+max);
	System.out.println("min: "+min);
	System.out.println("avg: "+average/5);
}
}
