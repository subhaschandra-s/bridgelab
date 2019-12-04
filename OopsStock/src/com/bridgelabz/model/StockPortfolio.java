package com.bridgelabz.model;

public class StockPortfolio 
{
   private String Name; 
   private int Share; 
   private int SharePrice;
   
   public String getName()
   {
	   return Name;
   }
   public void setName(String Name)
   {
	   this.Name=Name;
   }
   
   public int getShare()
   {
	   return Share;
   }
   
   public void setShare(int Share)
   {
	   this.Share=Share;
	   }
   
   public int getSharePrice()
   {
	   return SharePrice;
   }
   
   public void setSharePrice(int SharePrice)
   {
	   this.SharePrice=SharePrice;
   }
   
   public String toString()
   {
	   return "Stock [name=" + Name + ", Share=" + Share + ", SharePrice=" + SharePrice + "]";
   }
   
}
