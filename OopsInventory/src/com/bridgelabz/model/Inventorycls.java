package com.bridgelabz.model;

public class Inventorycls 
{
		private String name;
		private long  weight;
		private double price;
		
		public String getname() 
		{
			return name;
		}
		
		public void setname(String name) 
		{
			this.name=name;
		}
		
		public long getweight() 
		{
			return weight;
		}
		
		public void setweight(long weight) 
		{
			this.weight=weight;
		}
		
		public double getprice()
		{
			return price;
		}
		
		public void setprice(double price)
		{
			this.price=price;
		}
		@Override
		public String toString()
		{
			return "Inventory [name=" + name + ", weight=" + weight + ", pricePerKg=" + price + "]";
		}
		

}


