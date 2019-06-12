package com.srujana.eshopbackend.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.srujana.eshopbackend.dao.CatagoryDao;
import com.srujana.eshopbackend.model.Catagory;

@Component("catagoryDaoImpl")
public class CatagoryDaoImpl implements CatagoryDao{

	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean saveCategory(Catagory category) {
		System.out.println(sessionFactory);
		Session session=sessionFactory.openSession();
		/*if(category.getCatagoryId()==0)
		{
			int catagoryId	=(int)(Math.random()*10000);
			category.setCatagoryId(catagoryId);
		}*/
		
		
		try {
			session.save(category);
			Transaction transaction=session.beginTransaction();
			transaction.commit();
			return true;
		}
		catch(Exception e)
		{
		
			e.printStackTrace();
			return false;
		}
		finally {
		session.close();
		}
	}

	@Override
	public boolean deleteCategory(Catagory category) {
		Session session=sessionFactory.openSession();
		try
		{
		session.delete(category);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
			
		}
		finally
		{
			session.close();
		}
		
		
	}

	@Override
	public Catagory getCategory(int categoryId) {
		Session session=sessionFactory.openSession();
		
		try {
		Catagory catagory=session.get(Catagory.class, categoryId);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		return catagory;
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally
		{
			session.close();
		}
	}

	@Override
	public List<Catagory> getCategoryList() {
		Session session=sessionFactory.openSession();
		try
		{
		Query query=session.createQuery("from com.srujana.eshopbackend.model.Catagory");
					List<Catagory> catagories=query.list();
		return catagories;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally
		{
			session.close();
		}
	}

	@Override
	public boolean editCategory(Catagory category) {
		Session session=sessionFactory.openSession();
		/*if(category.getCatagoryId()==0)
		{
			int catagoryId	=(int)(Math.random()*10000);
			category.setCatagoryId(catagoryId);
		}*/
		
		
		try {
			session.update(category);
			Transaction transaction=session.beginTransaction();
			transaction.commit();
			return true;
		}
		catch(Exception e)
		{
		
			e.printStackTrace();
			return false;
		}
		finally {
		session.close();
		}
		
	}

	
}
