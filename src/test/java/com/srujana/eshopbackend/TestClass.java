package com.srujana.eshopbackend;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class TestClass {

	@BeforeClass
	public static void testBefore()
	{
		System.out.println("Before class");
	}
	@Before
	public void before()
	{
		System.out.println("Before ");
	}
	@Test
	public void test()
	{
		Cal c=new Cal();
		System.out.println("test class");
		assertEquals("sucess",true,c.even(6));
		
	}
	@After
	public void after()
	{
		System.out.println("after");
	}
	
	@AfterClass
	public static void testAfter()
	{
		System.out.println("After class");
	}
}
