package com.srujana.eshopbackend.dao;

import java.util.List;

import com.srujana.eshopbackend.model.Product;



public interface ProductDao {

	boolean saveProduct(Product product);
    
    boolean deleteProduct(Product product);
    
    Product getProduct(int productId);
    
    List<Product>    getProductList();
}
