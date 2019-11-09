package DS;

public class quicksort 
{
public static void Quicksort(int a[],int l,int h)
{
	if(l<h)
	{
		int j=partion(a,l,h);
		Quicksort(a,l,j-1);
		Quicksort(a,j-1,h);
		
	}
	
	}

	

static int partion(int a[],int l,int h)
{
	int pivot=a[l];
	int low=l+1;
	while(low<h)
	{
		while(a[low]<pivot)
			low++;
		while(a[low]>pivot)
			h--;
		if(low<h)
		{
			int t=a[low];
			a[low]=a[h];
			a[h]=t;
		}
	}
	a[l]=a[h];
	a[h]=pivot;
	return h;
	
}
static void printarray(int a[])
{
	int n=a.length;
	for (int i=0; i<n; ++i) 
        System.out.print(a[i]+" "); 
    System.out.println();
	 
}


public static void main(String[] args)
{
	int a[]= {35,33,42,10,14,19,27,44,26,31}; 
	  
	int n = a.length; 
	  
    quicksort ob = new quicksort(); 
    ob.Quicksort(a, n, n-1); 

    System.out.println("sorted array" ); 
    
        printarray(a); 
        
   }
}


