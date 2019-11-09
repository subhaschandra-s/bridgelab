package DS;

public class Mystack 
{
	Object obj[];
	int capacity;
	int top;
	
	Mystack(int capacity)
	{
		this.capacity=capacity;
		obj=new Object[capacity];
		top=-1;
	}
	
	public void push(Object data)
	{
		if(top==capacity-1)
		{
			System.out.println("stackover flow");
			return;
		}
		obj[++top]=data;
	}
	
public String toString()
{
	String st="[";
	for(int i=0;i<=top;i++)
	{
		st=st+obj[i];
		if(i<top)
		st=st+" ";
	}
	return st+"]";
	
}
public Object peek()
{
	if(top==-1)
	{
		System.out.println("stck overflow");
		return null;
	}
	return obj[top];
}

public Object pop()
{
	if(top==-1)
	{
		System.out.println("stck overflow");
		return null;
	}
	return obj[top--];
}
public int size()
{
	return top+1;
}

public int capacity()
{
	return capacity;
}
}
