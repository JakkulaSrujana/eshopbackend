package com.srujana.eshopbackend.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.srujana.eshopbackend.dao.ProductDao;
import com.srujana.eshopbackend.model.Product;
import com.srujana.eshopbackend.model.Supplier;

@Component("productDaoImpl")
public class ProductDaoImpl implements ProductDao{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean saveProduct(Product product) {
		System.out.println(sessionFactory);
		Session session=sessionFactory.openSession();
		
		
		
		try {
			session.save(product);
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
	public boolean deleteProduct(Product product) {
		Session session=sessionFactory.openSession();
		try
		{
		session.delete(product);
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
	public Product getProduct(int productId) {
		Session session=sessionFactory.openSession();
		try {
			Product product=session.get(Product.class, productId);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		return product;
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
	public List<Product> getProductList() {
		Session session=sessionFactory.openSession();
		try
		{
		Query query=session.createQuery("from com.srujana.eshopbackend.model.Product");
					List<Product> products=query.list();
		return products;
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
	public boolean editProduct(Product product) {
Session session=sessionFactory.openSession();
		
		
		
		try {
			session.update(product);
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
