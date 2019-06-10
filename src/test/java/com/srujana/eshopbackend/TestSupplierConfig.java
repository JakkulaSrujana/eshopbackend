package com.srujana.eshopbackend;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.srujana.eshopbackend.daoImpl.SupplierDaoImpl;
import com.srujana.eshopbackend.model.Supplier;

public class TestSupplierConfig {

	 static AnnotationConfigApplicationContext configApplicationContext;
	 static SupplierDaoImpl supplierDaoImpl;
	 
	 
	 @BeforeClass
	public static void test1()
	{
		System.out.println("Before class");
		configApplicationContext=new AnnotationConfigApplicationContext();
		configApplicationContext.scan("com.srujana.eshopbackend");
		configApplicationContext.refresh();
		supplierDaoImpl=(SupplierDaoImpl)configApplicationContext.getBean("supplierDaoImpl");
		
	}
	@Test
	public void saveSupplier_positiveTest()
	{
		
		System.out.println(supplierDaoImpl);
		Supplier supplier=new Supplier();
		supplier.setSupplierName("aaa");
		supplier.setSupplierDescription("bbb");
		supplier.setSupplierAddress("Hyd");
		assertEquals("sucess",true,supplierDaoImpl.saveSupplier(supplier));
	
	}
	@Test
	public void saveSupplier_negativeTest()
	{
		
		
		
		
		System.out.println(supplierDaoImpl);
		Supplier supplier=new Supplier();
		supplier.setSupplierName("aaa");
		supplier.setSupplierDescription("bbb");
		supplier.setSupplierAddress("Hyd");
		assertEquals("sucess",true,supplierDaoImpl.saveSupplier(supplier));
	}
}
