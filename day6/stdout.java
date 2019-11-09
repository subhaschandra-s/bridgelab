package day6;

public class stdout 

{
	public static void print(String s)
	{
		s="channa";
		System.out.print("the statndard output print  " +s);
				
	}
	public static void println(String s)
	{
		 s="basava";
		System.out.println("it will print new Line " +s );
	}
	public static void print()
	{
		System.out.println("new Line");
	}
	public static void printf(String x,String y)
	{
		x="channa";
		y="basava";
		System.out.println("the format is *****"+ x + y);
		
	}

    public static void main(String[] args)
	{
		String s = null;
		print(s);
		
		String x = null,y=null;
		printf(x,y); 
		
	}
}


