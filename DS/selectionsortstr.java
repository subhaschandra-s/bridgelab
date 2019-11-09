package DS;

public class selectionsortstr 
{
       private static void selectionsort(String arr[])
	        {
	                String t="";
	                for(int i=0;i<arr.length;i++)
	                {
	                        int in=i;
	                
	                   for(int j=i+1;j <arr.length;j++)
	                   {
	                           if(arr[j].compareTo(arr[in])<0)
	                                {
	                                   in=j;
	                                 }
	                   }
	                
	                    t=arr[in];
	                    arr[in]=arr[i];
	                  arr[i]=t;
	           }
	        }
	        
	        public static void main(String[] args) 
	        {
	        	
	         String a[]= {"giri","sagar","channa","manoj"};
	        selectionsort(a);
	        
	        for(int i=0;i<a.length;i++)
	        {
	                System.out.println(a[i]+" ");
	        }
	}


	}


