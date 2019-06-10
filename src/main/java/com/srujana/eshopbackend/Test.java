package com.srujana.eshopbackend;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.srujana.eshopbackend.model.Catagory;

public class Test {
	
	public static void main(String[] args) {
		
		//ApplicationContext context=new ClassPathXmlApplicationContext("DbConfig.xml");
		System.out.print("hello");
		//SessionFactory sessionFactory=(SessionFactory)context.getBean("sessionFactory");
		 TestCat testCat=new TestCat();
		testCat.testSaveCat();
	
	}
	
	

}
