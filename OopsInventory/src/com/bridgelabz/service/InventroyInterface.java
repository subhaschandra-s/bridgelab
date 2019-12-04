package com.bridgelabz.service;


public interface InventroyInterface 
{

	void addInventory(); 

	void removeInventory() throws Exception;

	double totalPrice() throws Exception;

	long totalWeight() throws Exception;

	void displayInventory() throws Exception;
}