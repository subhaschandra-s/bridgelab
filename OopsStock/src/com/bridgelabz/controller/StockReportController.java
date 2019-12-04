package com.bridgelabz.controller;

import com.bridgelabz.Utility.Utility;
import com.bridgelabz.serviceImpl.StockReportimpl;

public class StockReportController 
{
	public static void main(String[] args) throws Exception
	{
		StockReportimpl report=new StockReportimpl();
		System.out.println("Enter the file name to print the stock report");
		String file=Utility.readingString();
		report.PrintReport(file);	
	}


}
