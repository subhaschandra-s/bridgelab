package DS;

public class singlylinkedlist 
{
class Node
{
	Object data;
	Node next;
	Node(Object data)
	{
		this.data=data;
	}
}
Node head;
public void add (Object obj)
{
	Node n=new Node(obj);
	if(head==null)
	{
		head=n;
		return;
	}
	Node t=head;
	while(t.next!=null)
	{
		t=t.next;
		
	}
	t.next=n;
}
//public void display()
//{
//	Node t=head;
//	while(t!=null)
//	{
//		System.out.println(t.data);
//		if(t.next!=null)
//			System.out.println("-->");
//		t=t.next;
//	}
//}
public void addFirst(Object data)
{
	Node n=new Node(data);
	n.next=head;
	head=n;
	
}
public String toString()
{
	String st="";
	Node t=head;
	while(t!=null)
	{
		st=st+t.data;
		if(t.next!=null)
			st=st+"-->";
		t=t.next;
	}
	return st;
	
}
public Object getFirst()
{
	if(head==null)
	{
		System.out.println("list is empty");
		return null;
	}
	return head.data;
}

public Object getLast()
{
	if(head==null)
	{
		System.out.println("list is empty");
		return null;
	}
	Node t=head;
	while(t.next!=null)
	{
		t=t.next;
	}
	return t.data;
}
public Object deleteFirst()
{
	if(head==null)
	{
		System.out.println("list is empty");
		return null;
	}
	Object  obj=head.data;
	head=head.next;
	return obj;
}

public Object deleteLast()
{
	if(head==null)
	{
		System.out.println("list is empty");
		return null;
	}
	Node t=head;
	Node tp=head;
	while(t.next!=null)
	{
		tp=t;
		t=t.next;
	}
	tp.next=null;
	return t.data;
}

public void add(Object data,int in)
{
	if(in<0 || in>size())
	{
		System.out.println("index not in the range");
		return;
	}
	Node n=new Node(data);
	if(in==0)
	{
		addFirst(data);
		return;
	}
		Node t=head;
		while(in>1)
		{
			t=t.next;
			in--;
		}
		n.next=t.next;
		t.next=n;
	}


public int size()
{
	int count=0;
	Node t=head;
	while(t!=null)
	{
		t=t.next;
		count++;
	}
return count;	
}
public Object delete(int in)
{
	if(in<0 ||in>size())
	{
		System.out.println("index not in the range");
		return null;
	}
	if(in==0)
	{
		Object data=head.data;
		head=head.next;
		return data;
	}
	Node t=head;
	while(in>1)
	{
		t=t.next;
		in--;
	}
	Object data=t.next.data;
	t.next=t.next.next;
	return data;
	
}

//public void  Dispreverse(Node n)
//{
//	if(n.next!=null)
//	{
//		Dispreverse(n.next);
//	
//}
//	System.out.println(n.data);
//}
public void reverse(Node n)
{
    Node  prev=null;
	Node  curr=n;
	Node  next=null;
	
	while(curr!=null)
	{
		next=curr.next;
		curr.next=prev;
		prev=curr;
		curr=next;	
	}
	head=prev;
	System.out.println(head.data);
}

}
