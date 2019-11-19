package DS;

public class Mergesort 
{
	public static void mergesort(int a[],int l,int h)
	{
		if(l<h) {
			int m=(l+h)/2;
			mergesort(a,l,m);
			mergesort(a,m+1,h);
			merge(a,l,m,h);
		}
		
		}
	public static void merge(int a[],int l,int m,int h)
	{
		int b[]=new int[h-l+1];
		int i=l,k=0;
		int j=m+1;
		while(i<=m && j<=h)
		{
			if(a[i]<a[j])
				b[k++]=a[i++];
			else
				b[k++]=a[j++];
		}
		while(i<=m)
		{
			b[k++]=a[i++];
		}
		while(j<=h)
		{
			b[k++]=a[j++];
		}
		for(k=0;k<b.length;k++)
		{
			a[l+k]=b[k];
					
		}
	}
	
	public static void printarray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
	 
public static void main(String[] args) 
{
	int a[]= {38,27,43,3,9,82,10};
	
	Mergesort ob=new Mergesort();
	ob.mergesort(a,0,a.length-1);
	
	System.out.println("\nSorted array"); 
    printarray(a); 
    System.out.println("----");
}
}
