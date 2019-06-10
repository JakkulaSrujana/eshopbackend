package com.srujana.eshopbackend.dao;

import java.util.List;

import com.srujana.eshopbackend.model.Supplier;



public interface SupplierDao {

	boolean saveSupplier(Supplier supplier);
    
    boolean deleteSupplier(Supplier supplier);
    
    Supplier getSupplier(int supplierId);
    
    List<Supplier>    getSupplierList();
    

}
