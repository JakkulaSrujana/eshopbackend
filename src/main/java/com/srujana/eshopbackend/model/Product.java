package com.srujana.eshopbackend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity(name="ProductTable")
public class Product {
	@Id
	private int productId;
	private String productName;
	private String productDescription;
	private int productPrice;
	private String productCatagory;
	private String productSupplier;
	@Transient
	private MultipartFile proImage;
	public MultipartFile getProImage() {
		return proImage;
	}
	public void setProImage(MultipartFile proImage) {
		this.proImage = proImage;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductCatagory() {
		return productCatagory;
	}
	public void setProductCatagory(String productCatagory) {
		this.productCatagory = productCatagory;
	}
	public String getProductSupplier() {
		return productSupplier;
	}
	public void setProductSupplier(String productSupplier) {
		this.productSupplier = productSupplier;
	}
	
	

}
