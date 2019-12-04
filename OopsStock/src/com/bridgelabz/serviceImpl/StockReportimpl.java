package com.bridgelabz.serviceImpl;

import java.io.FileReader;


import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.model.StockPortfolio;



public class StockReportimpl 
{
	public void PrintReport(String filename)
	{
	try{
	long totalshares=0;
	JSONParser parse=new JSONParser();
	String value=parse.parse(new FileReader(filename+".json")).toString();
	JSONArray array=new JSONArray(value);
	StockPortfolio stk[]=new StockPortfolio[array.length()];
		
	
	System.out.println("Name\tShare\tSharePrice\ttotalsharePrice");
	
	for(int i=0;i<array.length();i++)
				{
					stk[i]=new StockPortfolio();	
					JSONObject obj=array.getJSONObject(i);
					stk[i].setName(obj.get("name").toString());
					System.out.print(stk[i].getName()+"\t");
					stk[i].setShare((int)obj.get("share"));
					System.out.print(stk[i].getShare()+"\t");
					stk[i].setSharePrice((int)obj.get("price"));
					System.out.print(stk[i].getSharePrice()+"\t\t");
					System.out.print(stk[i].getShare()*stk[i].getSharePrice());
					totalshares+=(stk[i].getShare()*stk[i].getSharePrice());
				    System.out.println();	
				}
	System.out.println("\nTotalshare is\t"+totalshares);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}

