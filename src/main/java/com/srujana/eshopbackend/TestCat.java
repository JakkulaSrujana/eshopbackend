package com.srujana.eshopbackend;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.srujana.eshopbackend.model.Catagory;



public class TestCat {

	
	public  void testSaveCat()
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("DbConfig.xml");
	System.out.print("--------hello---------");
	SessionFactory sessionFactory=(SessionFactory)context.getBean("sessionFactory");
		Catagory catagory=new Catagory();
		catagory.setCatagoryId(12346);
		catagory.setCatagoryName("aaa");
		catagory.setCatagoryDescription("bbb");
		System.out.println(sessionFactory);
		Session session=sessionFactory.openSession();
		session.save(catagory);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		
	}
}
