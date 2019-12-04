package com.bridgelabz.serviceimpl;

import java.io.FileReader;

import java.io.FileWriter;
import java.io.IOException;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelab.utility.Utility;
import com.bridgelabz.model.Inventorycls;
import com.bridgelabz.service.InventroyInterface;

public class InventaryImplementation implements InventroyInterface
{
	static long total = 0;
	static double pri = 0;

	@SuppressWarnings("unchecked")
	@Override
	public void addInventory() 
	{
		try {
			Inventorycls inventory = new Inventorycls();
//			FileReader reader = new FileReader("C:\\Users\\Admin\\git\\bridgelabz\\BridgeLab\\src\\json.json");
//			JSONParser ne = new JSONParser();
//			Object obj = ne.parse(reader);

			JSONArray arr = (JSONArray) readFile();

			FileWriter file = new FileWriter("C:\\Users\\Admin\\git\\bridgelabz\\BridgeLab\\src\\json.json");

			JSONObject objOne = new JSONObject();

			System.out.println("Enter the name of the product");
			inventory.setname(Utility.readingString());// setting the name of the inventory

			objOne.put("Name", inventory.getname());
			System.out.println("Enter the weight");
			inventory.setweight(Utility.readInt());

			objOne.put("Weight", inventory.getweight());

			System.out.println("Enter the Price");
			inventory.setprice(Utility.readDouble());

			objOne.put("PricePerKg", inventory.getprice());
			
			JSONObject objoned = new JSONObject();
			objoned.put("Inventory", objOne);
			arr.add(objoned);

			file.write(arr.toJSONString());
			file.flush();
			file.close();
		} catch (ParseException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public long totalWeight() throws Exception 
	{
		JSONArray org = readFile();
		total = 0;
		pri = 0;
		org.forEach(emp -> {
			try {
				parseInventory((JSONObject) emp, 1);
			} catch (Exception e) 
			{
				
				e.printStackTrace();
			}
		});
		return total;
	}

	private static JSONArray readFile() throws Exception 
	{
		try (FileReader reader = new FileReader("C:\\Users\\Admin\\git\\bridgelabz\\BridgeLab\\src\\json.json")) {
			JSONParser ne = new JSONParser();
			Object obj = ne.parse(reader);
			JSONArray arr = (JSONArray) obj;
			return arr;
		} catch (IOException e) 
		{
			e.printStackTrace();
		} catch (ParseException e) 
		{
			e.printStackTrace();
		}
		JSONArray nulll = new JSONArray();
		return nulll;
	}

	private static void parseInventory(JSONObject inv, int n) throws Exception 
	{

		JSONObject obj = (JSONObject) inv.get("Inventory");
		String Weight = String.valueOf(obj.get("Weight"));
		long w = Long.parseLong(Weight);
		String Price = String.valueOf(obj.get("PricePerKg"));
		double p = Double.parseDouble(Price);
		total = total + w;
		pri = pri + p;

	}

	@SuppressWarnings("unchecked")
	@Override
	public double totalPrice() throws Exception 
	{
		JSONArray org = readFile();
		total = 0;
		pri = 0;
		org.forEach(emp -> {
			try {
				parseInventory((JSONObject) emp, 2);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		return pri * total;
	}

	private static void parseInventory(JSONObject inv) throws Exception
	{

		JSONObject obj = (JSONObject) inv.get("Inventory");
		String name = (String) obj.get("Name");
		System.out.println("Name  : " + name);
		String Weight = String.valueOf(obj.get("Weight"));
		System.out.println("Weight: " + Weight);
		String Price = String.valueOf(obj.get("PricePerKg"));
		System.out.println("Price : " + Price);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void displayInventory() throws Exception 
	{
		JSONArray arr = readFile();
		arr.forEach(emp -> {
			try {
				parseInventory((JSONObject) emp);
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		});
	}

	@Override
	public void removeInventory() {

		try {
			System.out.println("Enter the name to be remove");
			String userInputName = Utility.readingString();
			boolean result = true;
			FileReader reader = new FileReader("C:\\Users\\Admin\\git\\bridgelabz\\BridgeLab\\src\\json.json");
			JSONParser ne = new JSONParser();
			JSONArray stored = (JSONArray) ne.parse(reader);
			for (int i = 0; i < stored.size(); i++) 
			{
				JSONObject jsonObject = (JSONObject) stored.get(i);
				JSONObject jsonObject1 = (JSONObject) jsonObject.get("Inventory");
				if (userInputName.equals(jsonObject1.get("Name"))) 
				{
					stored.remove(jsonObject);
					result = false;
					break;
				}

			}
			if (result) {
				System.out.println("Not Found ");
			} else {
				System.out.println("Succusefull.....");
			}
			try (FileWriter file = new FileWriter("C:\\Users\\Admin\\git\\bridgelabz\\BridgeLab\\src\\json.json")) {
				file.write(stored.toJSONString());
				file.flush();
			}
		} catch (IOException | ParseException ex) {
			System.out.println("Error: " + ex);
			
		}

	}

	public static void save() {

		System.out.println("SuccuseFull.......");
	}

}
