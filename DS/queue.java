package DS;

public class queue 
{
int capacity,rear,front;
Object obj[];
public queue(int capacity)
{
	this.capacity=capacity;
	front=rear=-1;
	obj=new Object[capacity];
}

public void enQue(Object data)
{
	if(rear==capacity-1)
	{
		System.out.println("que is full");
		return;
	}

	if(front==-1)
	{
		front=0;
	}
	obj[++rear]=data;
}
public String toString()
{
	String st="[";
	for(int i=front;i<=rear&&i!=-1;i++)
	{
		st=st+obj[i];
		if(i<rear)
			st=st+",";
		}
	return st+"]";
}
public Object deque()
{
	if(front==-1)
	{
		System.out.println("que is empty");
		return null;
	}
	Object data=obj[front];
	front++;
	if(front>rear)
	{
		front=rear=-1;
	}
	return data;
}

}
