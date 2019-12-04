package com.bridgelabz.controller;



import com.bridgelabz.serviceImpl.StockAccountImpl;

import utility.Utility;

public class StockManager 
{
public static void main(String[] args) throws Exception
{
	StockAccountImpl stockacc=new StockAccountImpl();
	int runner=0;
	while(runner!=1)
	{
	System.out.println("--------------StockManager------------\n\n"
			                              +"\t 1.Creating account\n"
										  +"\t 2.open exsisting account\n"
										  +"\t 3.Add or remove company\n"
										  +"\t 4.Exit\n");
	switch(Utility.readInt())
	{
	
	case 1:
		System.out.println("Enter the filename to store stock details");
		String filename=Utility.readingString();
		stockacc.createaccount(filename);
		break;
		
	case 2:
		System.out.println("Enter the filename to change stock details");
		String fname=Utility.readingString();
		stockacc.exsistingacc(fname);
		int end=0;
		while(end!=1)
		{
		System.out.println("------------Enter an option-------------\n\n"
				                     +"\t 1.AddMoney to account\n"
				                     + "\t 2.buyshare\n"
				                     + "\t 3.sellshare\n"
				                     + "\t 4.printreport\n"
				                     + "\t 5.save your accounts\n"
				                     + "\t 6.Exit");
		  switch(Utility.readInt())
		  {
		  case 1:
			  System.out.println("Enter the amount to add in your stock");
			  double amount=Utility.readDouble(); 
			  stockacc.AddAmount(amount);
			  break;
			  
		  case 2:
			  System.out.println("Enter the Stock Symbol to buy");
			  String symbol=Utility.readingString();
			  System.out.println("Enter the amount");
			  double amt=Utility.readDouble();
			  stockacc.Buy( symbol,amt);
			  break;
			  
		  case 3:
			System.out.println("Enter the stock symbol to sell");
			String symbolsell=Utility.readingString();
			System.out.println("Enter the amount");
			double amtsell=Utility.readDouble();
			stockacc.Sell(amtsell, symbolsell);
			break;
			
		  case 4:
			  stockacc.PrintReport();
			 break;
		  case 5:
			  stockacc.Save();
			  end=1;
			  break;
			  
		  case 6:
			  System.out.println("Thank you!!!see you soon:) :) :)");
		      end=1;
			  break;
		      
		   default:
			   end=1;
			   System.out.println("Wrong choice :( :( :(_____account closed");
			   break;
		  }
		}
		runner=1;
		break;
	
	case 3:
		System.out.println("press 1 to add company and press 2 to remove company");
		int choice=Utility.readInt();
		if(choice==1){
			stockacc.addcompany();
		}
		else if(choice==2)
		{
			stockacc.removecompany();
		}
		else{
			System.out.println("wrong choice....:( :( :(");
		}
		break;
		
	case 4:
		
		System.out.println("Thankyou:) :) :) see you soon.");
		runner=1;
		break;
		
    default:
    	System.out.println("Wrong choice:( :( :( ");
    	runner=1;
	  }
	}
}
}

