package com.srujana.eshopbackend.daoImpl;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.srujana.eshopbackend.dao.UserDao;
import com.srujana.eshopbackend.model.User;
@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean addUser(User user) {
		
		   
		      Session session=sessionFactory.openSession();
		      try
		      {
		        user.setRole("ROLE_USER");
		        user.setEnabled(true);
		        session.save(user);
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
	public boolean checkLogin(User user) {
		
		
	        Session session=sessionFactory.openSession();
	        Query query=session.createQuery("from User where email=:em and password=:pw");
	        query.setParameter("em",user.getEmail());
	        query.setParameter("pw",user.getPassword());
	        Object object=query.uniqueResult();
	        User user2=(User)object;
	        if(user2==null)
	        {
	            return false;
	        }
	        else {
	            return true;
	        }
	    
	    
	}



	@Override
	public User getUser(String email) {
		User user;
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from User where email=:em");
		query.setParameter("em",email);
		Object object=query.uniqueResult();
		user=(User)object;
		return user;
	}



	@Override
	public boolean editUser(User user) {
		
		 Session session=sessionFactory.openSession();
	      try
	      {
	        user.setRole("ROLE_USER");
	        user.setEnabled(true);
	        session.update(user);
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

}
