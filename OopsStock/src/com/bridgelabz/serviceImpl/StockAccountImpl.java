package com.bridgelabz.serviceImpl;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;

import utility.Queue;
import utility.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.Utility.Utility;
import com.bridgelabz.model.Company;
import com.bridgelabz.model.Stock;
import com.bridgelabz.model.Transaction;
import com.bridgelabz.service.StockAccount;

public class StockAccountImpl implements StockAccount
{
	Stock stockObject=new Stock();
	Company company=new Company();
	@SuppressWarnings("rawtypes")
	LinkedList List=new LinkedList();
	@SuppressWarnings("rawtypes")
	Queue queue=new Queue();
	
	
	JSONParser parser=new JSONParser();
	Transaction transaction=new Transaction();
	
	JSONObject stock;
	String filename;
	JSONArray array;
	JSONArray trans;
	double amountbalance;
	@SuppressWarnings("unchecked")
	
	public StockAccountImpl() throws Exception
	{
	String value=parser.parse(new FileReader("Company.json")).toString();
	array=new JSONArray(value);
	String transac=parser.parse(new FileReader("Transaction.json")).toString();
	trans=new JSONArray(transac);
	
	for(int i=0;i<array.length();i++)
		List.add(array.getJSONObject(i));
	}
	
	public void AddAmount(double amount) 
		{
			System.out.println("");
			try {
				stockObject.setAmountbalance(stockObject.getAmountbalance()+amount);
				stock.put("amount",(stockObject.getAmountbalance()));
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		double valueof() throws Exception
		{
			return stockObject.getAmountbalance();
		}
		
	

	@SuppressWarnings("unchecked")
	@Override
	public void Buy(String symbol,double amount) 
	{
		try{
			int count=0;
			for(int i=0;i<array.length();i++)
			{
				JSONObject object=(JSONObject)array.getJSONObject(i);
				if(object.get("symbol").equals(symbol))
				{
					setcompany(object);
					try 
					{
					setStock(symbol,(int)stock.get(symbol));
					}
					catch(Exception e)
					{setStock(symbol,0);}
					count++;
					if(amount>=(int)company.getpriceperShare()){
						int share=(int)(amount/company.getpriceperShare());
						try{
						stockObject.setshare(stockObject.getshare()+share);
						if(amountbalance<share*(int)company.getpriceperShare()) {
							System.out.println("your amountbalance is too low");
							break;
						}
						stock.put(symbol,stockObject.getshare());
						stock.put("name", stockObject.getName());
						queue.enqueue(new Date());
						setTransaction(object,"sell");
						queue.dequeue();
						}
						catch(Exception e){
							stock.put(symbol,share);
							}
						amountbalance-=share*object.getDouble("priceperShare");
						stock.put("amount",amountbalance);
					}
					else
					{
						System.out.println("your amount is too low");
					}
				}
			}
		    if(count==0)
				System.out.println("No companies available for this share");
			}
			catch(Exception e)
			{e.printStackTrace();}
		}
		
	@SuppressWarnings("unchecked")
	@Override
	public void Sell(double amount, String symbol) 
	{
		try{
			int count=0;
			if(checkstock(symbol)){
			for(int i=0;i<array.length();i++)
			{
				JSONObject object=(JSONObject)array.getJSONObject(i);
				if(object.get("symbol").equals(symbol))
				{
					setcompany(object);
					setStock(symbol,(int)stock.get(symbol));
					count++;
					if(amount>=company.getpriceperShare()){
						int share=(int)(amount/company.getpriceperShare());
						amountbalance+=(double)share*company.getpriceperShare();
						if(stockObject.getshare()>=share)
						{
					    stockObject.setshare(stockObject.getshare()-share);
						stock.put(stockObject.getSymbol(),stockObject.getshare());
						stock.put("amount",amountbalance);
						queue.enqueue(new Date());
						setTransaction(object,"sell");
						}
						else{System.out.println("you dont have enough shares");}
					}
					else
					{
						System.out.println("your amount is too low");
					}
			    }
				if(count==0)
					System.out.println("No companies available for this share");
			}
		}
			else{
				System.out.println("You dont have the stock in your account please buy first");
			}
			
			}
			catch(Exception e)
			{e.printStackTrace();}
		}
	
	private boolean checkstock(String symbol) 
	{
		try{
			  if(stock.get(symbol)!=null)
				  return true;
		  }
		  catch(Exception e)
		  {
			  return false;
		  }
		  return false;	
	}

	public void setTransaction(JSONObject object,String sellbuy) throws Exception
	{
		JSONObject tr=new JSONObject();
		transaction.setBuySell(sellbuy);
		tr.put("buy or sell",transaction.getBuySell());
		transaction.setDate(queue.dequeue().toString());
		tr.put("date",transaction.getDate());
		transaction.setName(object.get("name").toString());
		tr.put("name",transaction.getName());
		transaction.setSymbol(object.get("symbol").toString());
		tr.put("symbol", transaction.getSymbol());
		trans.put(tr);
	}
		
		
	

	@Override
	public void PrintReport() 
	{
		System.out.println(stock);
	   	   Save();
		
	}

	@Override
	public void Save()
	{		
		try {
			FileWriter account=new FileWriter(filename+".json");
			account.write(stock.toString());
			account.flush();
			FileWriter transaction=new FileWriter("Transaction.json");
			transaction.write(trans.toString());
			transaction.flush();
		}
		catch(Exception e)
		{e.printStackTrace();}
	
	}

	public void createaccount(String filename) throws Exception 
	{
		FileWriter fw=new FileWriter(filename+".json");
        stock=new JSONObject();
        stockObject.setName(filename);
		System.out.println("Add the initial amount in your stock account");
		stockObject.setAmountbalance(Utility.readDouble());
		stock.put("amount",stockObject.getAmountbalance());
		fw.write(stock.toString());
		fw.flush();
		
		
	}

	public void exsistingacc(String filename) throws Exception
	{
		this.filename=filename;
		String js=parser.parse(new FileReader(filename+".json")).toString();
		stock=new JSONObject(js);
		stockObject.setName(filename);
		stockObject.setAmountbalance(stock.getDouble("amount"));
		amountbalance=stockObject.getAmountbalance();	
	}
	
	public void setStock(String symbol,int share)
	{
		stockObject.setshare(share);
		stockObject.setSymbol(symbol);
	}
	public void setcompany(JSONObject js) throws Exception
	{
		company.setName(js.get("name").toString());
		company.setStocksymbol(js.get("symbol").toString());
		company.setpriceperShare(js.getDouble("priceperShare"));
	}
	public void Savecompany()
	{
		JSONArray arr=new JSONArray();
		int len=List.size();
		for(int i=0;i<len;i++)
		{
			arr.put(queue.dequeue());
		}
		try{
			FileWriter company=new FileWriter("company.json");
			company.write(arr.toString());
			company.flush();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}

	public void addcompany() throws Exception 
	{
		JSONObject temp=new JSONObject();
		   System.out.println("Enter the company name");
		   temp.put("name",Utility.readingString());
		   System.out.println("Enter the StockSymbol");
		   temp.put("stocksymbol",Utility.readingString());
		   System.out.println("Enter the shareperprice ");
		   temp.put("pershareprice",Utility.readDouble());
		   List.add(temp);
		   Savecompany();
		
		
	}

	public void removecompany() throws Exception 
	{
		System.out.println("Enter the company name");
		   String comp=Utility.readingString();   
		   for(int i=0;i<array.length();i++)
		   {
			   JSONObject temp=array.getJSONObject(i);
			   company.setName(temp.get("name").toString());
			   if(company.getName().equals(comp))
			   {
                     List.delete(i);
                     break;
			    }	  
		   }
		   Savecompany();
	}

}
