package com.srujana.eshopbackend.dao;

import java.util.List;

import com.srujana.eshopbackend.model.Catagory;

public interface CatagoryDao {

	

	    boolean saveCategory(Catagory category);
	    
	    boolean deleteCategory(Catagory category);
	    
	    Catagory getCategory(int categoryId);
	    
	    List<Catagory>    getCategoryList();
	    
	
}
