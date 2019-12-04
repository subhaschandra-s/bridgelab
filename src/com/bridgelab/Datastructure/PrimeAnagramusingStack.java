package com.bridgelab.Datastructure;

import com.bridgelab.Datastructure.Base.LinkedList;
import com.bridgelab.Datastructure.Base.Stack;
import com.bridgelab.Utility.utility;

public class PrimeAnagramusingStack 
{
     public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
	   LinkedList<Integer> al=new LinkedList<Integer>();
			boolean b;
			for (int j = 2; j <= 1000; j++) 
			{
				b = true;
				for (int i = 2; i < j / 2; i++) 
				{
					if (j % i == 0) {
						b = false;
						break;
					}
				}
				if (b)
					al.add(j);
			}

			for (int i = 0; i < al.size(); i++) 
			{
				for (int j = i + 1; j < al.size(); j++) 
				{
					if (utility.anagram(al.get(i), al.get(j))) {
						stack.push(al.get(i));
						stack.push(al.get(j));	
					}
					
				}	
			}
			stack.disp();
		}

}
