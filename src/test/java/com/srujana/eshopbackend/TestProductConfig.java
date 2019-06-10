package com.srujana.eshopbackend;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.srujana.eshopbackend.daoImpl.ProductDaoImpl;

import com.srujana.eshopbackend.model.Product;


public class TestProductConfig {

	static AnnotationConfigApplicationContext configApplicationContext;
	 static ProductDaoImpl productDaoImpl;
	 
	 
	 @BeforeClass
	public static void test1()
	{
		System.out.println("Before class");
		configApplicationContext=new AnnotationConfigApplicationContext();
		configApplicationContext.scan("com.srujana.eshopbackend");
		configApplicationContext.refresh();
		productDaoImpl=(ProductDaoImpl)configApplicationContext.getBean("productDaoImpl");
		
	}
	@Test
	public void saveProduct_positiveTest()
	{
		
		System.out.println(productDaoImpl);
		Product product=new Product();
		product.setProductName("aaa");
		product.setProductDescription("bbb");
		product.setProductPrice(45000);
		product.setProductCatagory("Dell");
		product.setProductSupplier("Dell");
		
		assertEquals("sucess",true,productDaoImpl.saveProduct(product));
	
	}
	@Test
	public void saveProduct_negativeTest()
	{
		
		System.out.println(productDaoImpl);
		Product product=new Product();
		product.setProductName("aaa");
		product.setProductDescription("bbb");
		product.setProductPrice(45000);
		product.setProductCatagory("Dell");
		product.setProductSupplier("Dell");
		
		assertEquals("sucess",true,productDaoImpl.saveProduct(product));
		
		
		
	}
}
