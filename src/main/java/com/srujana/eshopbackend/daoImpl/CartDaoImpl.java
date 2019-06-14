package com.srujana.eshopbackend.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.HttpSessionMutexListener;

import com.srujana.eshopbackend.dao.CartDao;
import com.srujana.eshopbackend.model.Cart;
import com.srujana.eshopbackend.model.Catagory;
import com.srujana.eshopbackend.model.Product;
import com.srujana.eshopbackend.model.Supplier;
import com.srujana.eshopbackend.model.User;

@Component("cartDaoImpl")
public class CartDaoImpl implements CartDao{

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean saveCart(Product product, int quantity,String uname) {
			Cart cart=new Cart();
			Session session= sessionFactory.openSession();
		
		cart.setProductId(product.getProductId());
		cart.setProductName(product.getProductName());
		cart.setProductPrice(product.getProductPrice());
	
		cart.setProductSupplier(product.getProductSupplier());
		cart.setQuantity(quantity);
	
		cart.setTotalPrice((product.getProductPrice())*(cart.getQuantity()));
		cart.setUserName(uname);
		
		
		try
		{
			/*if(cart.getCartId()==0) 
			{
				int id	=(int)(Math.random()*10000);
				cart.setCartId(id);
			}*/
			
			
			
			session.saveOrUpdate(cart);
			Transaction t=session.beginTransaction();
			t.commit();
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
	public boolean deleteCart(Cart cart) {
		Session session=sessionFactory.openSession();
		try
		{
		session.delete(cart);
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
	public Cart getCart(int cartId) {
Session session=sessionFactory.openSession();
		
		try {
		Cart cart=session.get(Cart.class, cartId);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		return cart;
		
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
	public List<Cart> getCartList(String userName) {
		
		
		Session session=sessionFactory.openSession();
		try
		{
		Query query=session.createQuery("from Cart where userName=:un");
		
		query.setParameter("un", userName);
		List<Cart> carts=query.list();
		return carts;
		
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
	
	/*public boolean editCart(Product product, int quantity,String uname,Cart cart) {
		//Cart cart=new Cart();

	
	cart.setProductId(product.getProductId());
	cart.setProductName(product.getProductName());
	cart.setProductPrice(product.getProductPrice());

	cart.setProductSupplier(product.getProductSupplier());
	cart.setQuantity(quantity);

	cart.setTotalPrice((product.getProductPrice())*(cart.getQuantity()));
	cart.setUserName(uname);
	
	Session session= sessionFactory.openSession();
	try
	{*/
		/*if(cart.getCartId()==0) 
		{
			int id	=(int)(Math.random()*10000);
			cart.setCartId(id);
		}*/
		
		
		
		/*session.update(cart);
		Transaction t=session.beginTransaction();
		t.commit();
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
	
}*/
	 

}
