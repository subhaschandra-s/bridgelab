package DS;

public class selectionsortint 
{
    public static void main(String[] args) 
	{
	        int a[]= {25,22,35,1,4,9};
	        
	        selectionsort(a);
	        for(int i=0;i<a.length;i++)
	        {
	                System.out.println(a[i]+" ");
	        }
	}

	private static void selectionsort(int arr[])
	{
	        for(int i=0;i<arr.length;i++)
	        {
	                int in=i;
	        
	           for(int j=i+1;j<arr.length;j++)
	           {
	                   if(arr[j]<arr[in])
	                      {
	                           in=j;
	                        }
	           }
	        
	           int t=arr[in];
	       	   arr[in]=arr[i];
	       	   arr[i]=t;
	        }
	}
	}


