package day2;

import java.util.Scanner;

public class Gambler 
{ 

    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the stake amount");
    	int stake  = sc.nextInt();  
    	System.out.println("enter the goal amount");								// gambler's stating bankroll
        int goal   = sc.nextInt();  
        System.out.println("enter the trails");	// gambler's desired bankroll
        int trials = sc.nextInt();  // number of trials to perform

        int bets = 0;        // total number of bets made
        int wins = 0;        // total number of games won

        // repeat trials times
        for (int t = 0; t < trials; t++) 
        {

            // do one gambler's ruin simulation
            int cash = stake;
            while (cash > 0 && cash < goal) 
            {
                bets++;
                if (Math.random() < 0.5) cash++;     // win $1
                else                     cash--;     // lose $1
            }
            if (cash == goal) wins++;                // did gambler go achieve desired goal?
        }

        // print results
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
    }

}
