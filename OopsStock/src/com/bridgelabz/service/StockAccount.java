package com.bridgelabz.service;

public interface StockAccount 
{
	void AddAmount(double amount);
	void Buy(String symbol,double amount);
	void Sell(double amount,String symbol);
	void PrintReport();
	void Save();

}