package com.srujana.eshopbackend.dao;

import java.util.List;

import com.srujana.eshopbackend.model.UserOrder;

public interface OrderDao {

	
		boolean saveOrder(UserOrder userOrder);
		List<UserOrder> getMyOrders(String userName);

		
}
