package com.srujana.eshopbackend.dao;

import com.srujana.eshopbackend.model.User;

public interface UserDao {

	 public boolean addUser(User user);
	    public boolean checkLogin(User user);
	    public User getUser(String email);
	    public boolean editUser(User user);
}
