package com.bridgelab.testing;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.bridgelab.Utility.utility;


public class check {

	@Test
	public void test() {
		assertEquals(utility.getmonthpayment(10000, 5, 10),212.4704471126833);
	}
	
	@Test
  public void test1() {
	assertEquals(utility.dayofweek(19, 11, 2019),2);
	
}
	@Test
	public void test3()
	{
		int[] arr= {1,0,0,0,0,0,0,0,0};
		assertArrayEquals(utility.getNotes(1000),arr);
	}
	
	@Test
	public void test4()
	{
		assertEquals(utility.getsqrt(25.0),5.0);
	}
	@Test
	public void test5()
	{
		assertEquals(utility.binaryToDecimal("01000110"),(70));
	}
	@Test
	public void test6()
	{
		assertEquals(utility.getcelsius(35),1.6666666666666667);
	}
	@Test
	public void test7()
	{
		assertEquals(utility.tobinaryString(10),"1010");
	}
	
}
