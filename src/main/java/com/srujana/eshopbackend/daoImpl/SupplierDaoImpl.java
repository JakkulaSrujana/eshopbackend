package com.srujana.eshopbackend.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.srujana.eshopbackend.dao.SupplierDao;
import com.srujana.eshopbackend.model.Catagory;
import com.srujana.eshopbackend.model.Supplier;

@Component("supplierDaoImpl")
public class SupplierDaoImpl implements SupplierDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean saveSupplier(Supplier supplier) {
		
		System.out.println(sessionFactory);
		Session session=sessionFactory.openSession();
		if(supplier.getSupplierId()==0)
		{
			int supplierId	=(int)(Math.random()*10000);
			supplier.setSupplierId(supplierId);
		}
		
		
		try {
			session.saveOrUpdate(supplier);
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
	public boolean deleteSupplier(Supplier supplier) {
		Session session=sessionFactory.openSession();
		try
		{
		session.delete(supplier);
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
	public Supplier getSupplier(int supplierId) {
		Session session=sessionFactory.openSession();
		try {
		Supplier supplier=session.get(Supplier.class, supplierId);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		return supplier;
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
	public List<Supplier> getSupplierList() {
		Session session=sessionFactory.openSession();
		try
		{
		Query query=session.createQuery("from com.srujana.eshopbackend.model.Supplier");
					List<Supplier> suppliers=query.list();
		return suppliers;
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

}
