package com.bridgelab.Datastructure;

import com.bridgelab.Datastructure.Base.Queue;
import com.bridgelab.Utility.utility;

public class BankingCashCounter {

	public static void main(String[] args)
	{	
		System.out.println("Enter number of persons");
        int person = utility.readInt();		
		int cash=10000;
		
		Queue<Integer> q=new Queue<Integer>();
		for (int i =1; i <=person; i++) {
			q. enqueue(i);
		}

		while(person!=0)
		{
			System.out.println("Cash present "+cash);
			int count=0,option=0;

			while(count==0)
			{
				System.out.println("\nEnter option \n1.Withdrawal\n2.Deposit");
				option=utility.readInt();
				if(option==1)
				{
					count+=1;
				}
				else if(option==2)
				{
					count+=2;
				}
				else
				{
					System.out.println("Invalied Option");
				}
			}

			if(count==1)
			{
				int amount1=0;
				int countWithdrawal=0;
				while(countWithdrawal==0)
				{
					System.out.println("Enter the amount to be Withdrawal:");
					amount1=utility.readInt();

					if(amount1>cash)
						System.err.println("Sorry, you Enter wrong amount\n");	
					else
						cash=cash-amount1;
					countWithdrawal++;
				}
				q.dequeue();
			}
			else if(option==2)
			{
				int amount2=0;
				int countdeposit=0;
				while(countdeposit==0)
				{
					System.out.println("Enter the Deposited amount:");
					amount2=utility.readInt();
					countdeposit++;
					if(amount2<0)
						System.err.println("Your enter amount is not valied\n");
					else
						cash=cash+amount2;
				}
				q.dequeue();
			}
			person--;
		}
		System.out.println("remaing :" + cash);

	}

}

