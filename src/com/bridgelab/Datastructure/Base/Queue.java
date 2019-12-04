package com.bridgelab.Datastructure.Base;

public class Queue<T extends Comparable<T>> 
{
		Node head;
		Node tail;
		/**
		 * @purpose creates a empty queue
		 * @param it needs nothing
		 */
		    public void Deque() 
		    {
		    	head = null;
		    }
		       
			public Queue() 
			{
				head = null;
			}	
			
			public void enqueue( T item)
			{
			Node n  = new Node(item);	
				if(head ==  null) 
				{
					head = n;
					head.next=null;
				}
				else 
				{
			Node t = head;
			while(t.next!=null)
			{
			t = t.next;
			}
			t.next = n;
			n.next = null;
				}
				
			}
			
			public void disp() 
			{
				Node t = head;
				while(t!=null) 
				{
					System.out.println(t.data);
				t = t.next;
				}
			}
			 
			@SuppressWarnings("unchecked")
			public T dequeue() 
			{
				Node t = head;
			if(head == null) 
			{
				System.out.println("queue is empty");
				return null;
			}
			
			head = head.next;
			return (T) t.data;
				
			}
			
			public boolean isEmpty() 
			{
				return head==null?true:false;		
			}
			
			public void addFront(T item) 
			{
		      Node n = new Node(item);
		      n.next =head; 
		      head  = n;
		      
			}
			public void addRear(T item)
			{
			enqueue(item);
			}
			
			public T removeFront() 
			{
				T data = dequeue();
				return data;
			}
			
			@SuppressWarnings("unchecked")
			public T removeRear() 
			{
				T data = null;
				Node t = head; 
				if(head.next ==  null)
				{
					data = (T) head.data;
					head = null;
					return data;
				}
				while(t.next.next != null)
				{
					t = t.next ; 
				}
				
				data = (T)t.next.data;
				t.next = null;
				return data;
			}
			public int size() 
			{
				Node t = head; 
				int count  = 0;
				while(t!=null) 
				{
					count++;
					t = t.next;
				}
				return count;
			}
			public void dispPrime() {
				int count = 0 ; 
				Node temp = head;
				while(temp!=null) {
					if(count%2==0) {
						System.out.println();
					}
					System.out.print(temp.data+" ");
				temp = temp.next;
				count++;
				
				}
			}
			
		}

