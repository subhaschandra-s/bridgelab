package day8home;
import java.util.Arrays;
import java.util.Scanner;

public class frqncount
{
	 public static void frequencyCount(String str)
	{
		 char[] arr = str.toCharArray();
		 Arrays.sort(arr);
		 
		 String str1 = "";
		 for(int i=0; i<arr.length-1; i++)
		 {
			 if(arr[i] != arr[i+1])
			 {
				 str1 += arr[i];
			 }
		 }
		 str1 += arr[arr.length-1];
		 
		 int a = 0;
		 for(int i=0; i<str1.length(); i++)
		 {
			 for(int j=0; j<arr.length; j++)
			 {
				 if(str1.charAt(i) == arr[j])
				 {
					 a++;
				 }
			 }
			 System.out.print(str1.charAt(i)+"="+a+"  ");
			 a = 0;
		 }
	}
	
	public static void main(String args[])
	{
		Scanner sc  =new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		frequencyCount(str);
	}
}    
   
