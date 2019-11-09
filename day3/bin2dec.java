package day3;

public class bin2dec
{
public static void main(String[] args) 
{
int n=10101;
int a=0;
double i=0;
while(n>0)
{
	double m=n%10;
	a=(int) (a+(m*Math.pow(2,i)));
	n=n/10;
	i++;
}
System.out.println(a);
}
}
