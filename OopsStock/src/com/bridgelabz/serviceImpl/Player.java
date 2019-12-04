package com.bridgelabz.serviceImpl;

import com.bridgelabz.service.Cards;

import utility.Queue;



public class Player implements Cards
{
    int index=0;
	String cards[];
	@SuppressWarnings("rawtypes")
	public Queue q=new Queue();
	String rank[]={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	public Player()
	{
		cards=new String[9];
		for(int i=0;i<9;i++)
			cards[i]=new String();
	}
	public void getCards(String card)
	{
			    cards[index]=card;
				index++;
				if(index==9)
				sort();
	}
	@SuppressWarnings("unchecked")
	public void sort()
	{
		for(int i=0;i<rank.length;i++)
		{
			for(int j=0;j<cards.length;j++)
			{
				if(cards[j].charAt(0)==rank[i].charAt(0))
				{
					q.enqueue(cards[j]);
				}
			}
		}
	}
}
