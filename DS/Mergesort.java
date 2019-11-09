package DS;

public class Mergesort 
{
	private static int m;
	public static void mergesort(int a[],int l,int h)
	{
		if(l<h)
		{
			int m=(l+h)/2;
			mergesort(a,l,m);
			mergesort(a,m+1,h);
			merge(a,l,m,h);
		}
	}
	public static void merge(int a[],int l,int h,int m)
	{
		int b[]=new int[h-l+1];
		int i=1,k=0;
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
public static void main(String[] args) 
{
	int a[]= {38,27,43,3,9,82,10};
	int l=a[0];
	int h=a.length-1;
	mergesort(a,l,h);
	merge(a, l, h, m);
}
}
