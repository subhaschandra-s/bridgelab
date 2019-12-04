/**
 Author:Subhas
 purpose:function to do stopwatch program
 version:1.2
 Filename:stopwatch
 Date:19/11/19
 */
package com.bridgelab.Logical;

import com.bridgelab.Utility.utility;

public class Stop_watch 
{
	public double starttime=0;
	public double stoptime=0;
	public long elapsed;
	
	public void start()
	{
		starttime=System.currentTimeMillis();
		System.out.println("the started time is" +starttime);
	}
	
	public void stop()
	{
		stoptime=System.currentTimeMillis();
		System.out.println("the Stoped time is" +stoptime);
	}
	public long getelapsedtime()
	{
	    elapsed=(long) (stoptime-starttime);
	    System.out.println("the elapsed time is " +elapsed);
		return elapsed;
		
	    
	}
	public static void main(String[] args)
	{
		Stop_watch sw=new Stop_watch();
		System.out.println("press 1 to start");
		int n=utility.readInt();
		sw.start();
		System.out.println("press 2 ton Stop");
		int n1=utility.readInt();
		sw.stop();
		
		long l=sw.getelapsedtime();
		System.out.println("");
		System.out.println("the time elapsed in millisec:" +l);
		System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");
		
	}



}
