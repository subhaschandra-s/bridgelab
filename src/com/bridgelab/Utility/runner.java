package com.bridgelab.Utility;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.bridgelab.testing.check;

public class runner {

	public static void main(String args[]) 
	{
		Result result =JUnitCore.runClasses(check.class);
		
		for(Failure f:result.getFailures()) 
		{
			System.out.println(f.toString());
	}
	System.out.println(result.wasSuccessful());

}
}
