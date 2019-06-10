package com.srujana.eshopbackend;

import static org.junit.Assert.assertEquals;

import org.hibernate.SessionFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.srujana.eshopbackend.daoImpl.CatagoryDaoImpl;
import com.srujana.eshopbackend.model.Catagory;

public class TestConfig {

	 static AnnotationConfigApplicationContext configApplicationContext;
	 static CatagoryDaoImpl catagoryDaoImpl;
	 
	 @BeforeClass
	public static void test1()
	{
		System.out.println("Before class");
		configApplicationContext=new AnnotationConfigApplicationContext();
		configApplicationContext.scan("com.srujana.eshopbackend");
		configApplicationContext.refresh();
		catagoryDaoImpl=(CatagoryDaoImpl)configApplicationContext.getBean("catagoryDaoImpl");
		
	}
	@Test
	public void saveCatagory_positiveTest()
	{
		
		
		
		
		System.out.println(catagoryDaoImpl);
		Catagory category=new Catagory();
		category.setCatagoryId(123845);
		category.setCatagoryName("aaa");
		category.setCatagoryDescription("bbb");
		assertEquals("sucess",true,catagoryDaoImpl.saveCategory(category));
	
	}
	@Test
	public void saveCatagory_negativeTest()
	{
		
		
		
		
		System.out.println(catagoryDaoImpl);
		Catagory category=new Catagory();
		category.setCatagoryId(123845);
		category.setCatagoryName("aaa");
		category.setCatagoryDescription("bbb");
		assertEquals("sucess",false,catagoryDaoImpl.saveCategory(category));
	
	}
	
}
