package com.srujana.eshopbackend.dao;

import java.util.List;

import com.srujana.eshopbackend.model.Cart;
import com.srujana.eshopbackend.model.Product;

public interface CartDao {
//boolean saveCart(Product product, int quantity,String uname);
	boolean saveCart(Cart cart);
	boolean editCart(Cart cart);
    boolean deleteCart(Cart cart);
    Cart getCart(int cartId);
    List<Cart>    getCartList(String userName);

}
