package com.bridgelabz.controller;

import com.bridgelab.utility.Utility;
import com.bridgelabz.serviceimpl.InventaryImplementation;


public class Main 
{
public static void main(String[] args) throws Exception 
{
	InventaryImplementation invt = new InventaryImplementation();
	System.out.println("Inventory present\n");
	try 
	{
		invt.displayInventory();
	} catch (Exception e2) 
	{
		e2.printStackTrace();
	}
	long resultWeight = 0;
	double resultPrice = 0;

	int temp = 0;
	while (temp == 0) 
	{
		System.out.println("\nTo perform operation ");
		System.out.println("Enter the Choice...\n");
		System.out.println("1.Add Inventory");
		System.out.println("2.Calculate Total Weight");
		System.out.println("3.Calculate Total Price");
		System.out.println("4.Remove Inventory");
		System.out.println("5.Save Inventory");
		System.out.println("6.Display Inventory");
		System.out.println("7.Exit");

		int choice = Utility.readInt();
		switch (choice) 
		{
		case 1:
			invt.addInventory();
			break;

		case 2:
			try 
			{
				resultWeight = invt.totalWeight();
			} catch (Exception e1) 
			{
				
				e1.printStackTrace();
			}
			System.out.println("Total weight of an inventory is : " + resultWeight);
			break;

		case 3:
			try {
				resultPrice = invt.totalPrice();
			} catch (Exception e1) 
			{
				
				e1.printStackTrace();
			}
			System.out.println("Total Price of an inventory is : " + resultPrice);
			break;

		case 4:
			invt.removeInventory();
			break;

		case 5:
			InventaryImplementation.save();
			break;

		case 6:
			try 
			{
				invt.displayInventory();
			} catch (Exception e) 
			{
				
				e.printStackTrace();
			}
			break;
		case 7:
			System.out.println("\nInventory Close...!!! Thank You ");
			temp = 1;
			break;

		default:
			System.err.println("\nInvalied choice");
			break;
		}
	}

}
}
