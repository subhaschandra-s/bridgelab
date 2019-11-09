package day3;

public class rolldie
{
	public static void main(String[] args) 
	    {
	        int SIDES = 6;   // how many sides on the die?
         double x=Math.random();
	        // roll should be 1 through SIDES
	        int roll = (int)(x* SIDES) + 1;
	        
	        System.out.println("random value is"+x);

	        // print results
	        System.out.println(roll);

	    }
	}




