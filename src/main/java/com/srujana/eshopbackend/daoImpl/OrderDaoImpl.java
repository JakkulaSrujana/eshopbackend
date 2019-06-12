package com.srujana.eshopbackend.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.srujana.eshopbackend.dao.OrderDao;
import com.srujana.eshopbackend.model.Catagory;
import com.srujana.eshopbackend.model.User;
import com.srujana.eshopbackend.model.UserOrder;
@Component
public class OrderDaoImpl implements OrderDao{

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean saveOrder(UserOrder userOrder) {
		Session session=sessionFactory.openSession();
		
		
		
		try {
			session.saveOrUpdate(userOrder);
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
	public List<UserOrder> getMyOrders(String userName) {
		
		Session session=sessionFactory.openSession();
		try
		{
			Query query=session.createQuery("from UserOrder where user.email=:em");
			query.setParameter("em",userName);
		List<UserOrder>	userOrder=query.list();
			
			return userOrder;
				
	
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


