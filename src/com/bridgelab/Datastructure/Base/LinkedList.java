package com.bridgelab.Datastructure.Base;
/********************************************************************************************
 * Purpose   :Unordered list reusable code with many methods 


 * @author   :Subhaschandra-s
 * @version  :1.0
 * @date     :21-11-2019
 * @Filename :LinkedList
 ********************************************************************************************/

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

import com.bridgelab.Utility.utility;

public class LinkedList<T>
{
	public class Node<T>
	{
		
	    T data;
		Node next;
		Node(T data)
		{
			this.data=data;
		}
	}
	Node head;
	Node next;


	/**
	 * @Purpose adds a new item to the list 
	 * @param it need the item
	 * @return it return nothing (void)
	 */

 public void add(T data) 
 {
	 Node n =new Node(data);

	 if(head==null) {
		 head=n;
		 return;
		 
	 }
	 else
	 {
		 Node t=head;
		 while(t.next!=null)
		 {
			 t=t.next;
		 }
		 t.next=n;
		 
	 }
 }
 /**
	 * @Purpose adds a new item to the first 
	 * @param it need the item
	 * @return it return nothing (void)
	 */
 
 
 public void addatstart(T data)
 {
	 Node n=new Node(data);
	 n.next=null;
	 n.next=head;
	 head=n;
 }
 public void addAt(T data,int in)
 {
	 if(in<0 || in>size())
	 {
		 System.out.println("index not in the range");
		 return;
	 }
	 Node n=new Node(data);
	 if(in==0)
	 {
		 addatstart(data);
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
 public void remove1(T item) 
 {
		Node<T> n = head;
		Node<T> prev = null;
		if (head.data.equals(item)) {
			head = head.next;
			return;
		}
		while (!n.data.equals(item)) {
			prev = n;
			n = n.next;
		}
		n = n.next;
		prev.next = n;

	}
 
 public <T extends Comparable<T>> void remove(T data)
 {
	 Node<T> current=head;
	 Node<T> previous=head;
	 Node<T> next=head;
	 if(current.data.compareTo(data)==0)
	 head=head.next;
	 else{
	 while(current!=null)
	 {
	   if(current.data.compareTo(data)==0)
	   {
	 previous.next=next;
	 break;
	   }
	   else if(next.next==null && ((next.data).compareTo(data))==0)
	   {
	   current.next=null;
	    break;
	   }
	 previous=current;
	 current=next;
	 next=next.next;
	 }
	 }
	 }
 
  public void show()
  {
	  Node<T> t=head;
	  while(t!=null)
	  {
	   System.out.println(t.data+"  ");
	   t=t.next;
	  }	  
  }
 
  public int size()
  {
	  int size=0;
	  Node temp = head;
	  while(temp!=null) {
		 size++;
		 temp=temp.next;
	  }
	  
	  return size;
  }
  
  public void toFile() throws Exception
  {
  Node t=head;
  String str="",f_name;
  System.out.println("enter the new file name to store processed list");
  f_name=utility.readingString();
  FileOutputStream file=new FileOutputStream(f_name);
  DataOutputStream dis=new DataOutputStream(file);
  while(t!=null)
  {
  str=str+t.data+",";
  t=t.next;
  }
  dis.writeUTF(str);
  dis.close();
  }
  
  @Override
  public String toString()
  {
	  StringBuffer s=new StringBuffer();
	  Node t=head;
	  while(t!=null)
	  {
		  s.append(t.data);
		  t=t.next;
	  }
	  return s.toString();
	  
  }
  public <T extends Comparable<T>>boolean search(T s[],T find)
  {
	  for(int i=0;i<s.length;i++)
	  {
		  if(s[i].equals(find))
		  {
			  return true;
	  }
	  }
	  return false;
  }
  
  /**
   Ordered list..
   */
  public <T extends Comparable<T>>int orderIndex(T data)
  {
	  Node<T> temp=head;
	  for(int i=0;temp!=null;i++)
	  {
		  if(temp.data.compareTo(data)<0)
		  {
			  temp=temp.next;
		  }
		  	else
		  	{
		  		return i;
		  	}

	  }
  return 0;
  }
 
public boolean isEmpty()
{
	if(head==null)
	return true;
	return false;
}

public T get(int index) 
	{
		Node temp =head;
		Node prev = null;
		T data = null;
	for(int i = 0 ; i<=index;i++) 
	{
		prev = temp;
		temp = temp.next;
	}
	return (T) prev.data;
	}
  

public void toFileHash(LinkedList link[]) throws Exception
{
Node t=head;
int count=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String rewrite="",f_name;
System.out.println("enter the new file name to store processed list");
f_name=br.readLine();
FileOutputStream file=new FileOutputStream(f_name);
DataOutputStream dis=new DataOutputStream(file);
for(int i=0;i<link.length;i++)
{
if(!link[i].isEmpty())
{
  while(link[i].head!=null )
  {
  rewrite=rewrite+link[i].pos()+",";
  }
}
else
 {
  rewrite=rewrite+"null,";
 }
System.out.print("  ");
}
dis.writeUTF(rewrite);
dis.close();
}

public T pos() 
{
	Node t = head;
if(head == null) 
{
	System.out.println("queue is empty");	
}
return null;
}

public void Disp()
{
	  Node<T> t=head;
	  while(t!=null)
	  {
		  if((Integer)t.data!=-1)
			  if((Integer)t.data<10)
		  System.out.print(t.data+"  ");
			  else
				  System.out.print(t.data+" ");
		  else
			  System.out.print("   ");
		  t=t.next;
	  }
}
}





