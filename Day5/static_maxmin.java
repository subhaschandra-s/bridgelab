package Day5;

public class static_maxmin
{
	public static String max(String[] arr)
	{
		if(arr ==null || arr.length==0)
			return null;
	
	String max=arr[0];
	for(int i=1;i<arr.length;i++)
	{
	if(max.compareTo(arr[i]) < 0)
		max=arr[i];
	}
	return max;
	}
	public static String min(String[] arr)
	{

		
	String min=arr[0];
	for(int i=1;i<arr.length;i++)
	{
	if(min.compareTo(arr[i]) > 0)
		min=arr[i];
	}
	return min;
	}
public static void main(String[] args) 
{
	String arr[]= {"A","B","C","D","Z","a"};
	String max1=max(arr);
	System.out.println("the max is " +max1);
	String min=min(arr);
	System.out.println("the min is " +min);
}
}


