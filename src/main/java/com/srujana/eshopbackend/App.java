package com.srujana.eshopbackend;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("DbConfig.xml");
		System.out.print("hello");
		SessionFactory sessionFactory=(SessionFactory)context.getBean("sessionFactory");
		System.out.println(sessionFactory);
	}

}
