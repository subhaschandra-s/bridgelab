package DS;

import DS.singlylinkedlist.Node;

public class DoublyLinkedlist 
{
class Node
{
	Object data;
	Node next;
	Node prev;
	Node(Object data)
	{
		this.data=data;
	}
}
Node head;
public void add(Object data)
{
	Node n=new Node(data);
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
	n.prev=t;
}
public void addFirst(Object data)
{
	Node n=new Node(data);
	if(head==null)
		
	{
		head=n;
		return;
	}
	head.prev=n;
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
			st=st+"<->";
			t=t.next;	
	}
	return st;
}
public Object deleteFirst()
{
	if(head==null)
	{
		System.out.println("list is empty");
		return null;
	}
	Object obj=head.data;
	head=head.next;
	if(head!=null)
	head.prev=null;
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
	while(t.next!=null)
	{
		t=t.next;
	}
	Object obj=t.data;
	if(t.prev!=null)
	t.prev.next=null;
	else
		head=null;
	return obj;
}
public  void add(Object data,int in)
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
		while(in>0)
		{
			t=t.next;
			in--;
		}
		n.next=t;
		n.prev=t.prev;
		t.prev.next=n;
		t.prev=n;
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
public void Dispreverse(Node n)
{
	if(n.next!=null)
		Dispreverse(n.next);
	System.out.println(n.data);
}
}
