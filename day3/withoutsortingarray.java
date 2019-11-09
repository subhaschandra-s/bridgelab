package day3;

public class withoutsortingarray 
{
public static void main(String[] args) 
{
	int big=0;
	
	int n[]= {10,25,69,78,45,90,67};
	
	for(int i=0;i<n.length;i++)
	{
       for(int j=i+1;j<n.length;j++)
       {
    	   if(n[i]<n[j])
    	   {
    		   big=n[j];
    		   n[j]=n[i];
    		   n[i]=big;
    	   }
    	   }
	}
	System.out.println("second biggest-->"+n[1]);
	System.out.println("second smallest--->"+n[n.length-2]);
}
}
       
       
	
