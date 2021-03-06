package com.srujana.eshopbackend.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class User {

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	@Id
    private String email;
    private String password;
    private String userName;
    private String mobile;
   
    private String role;
    private boolean enabled;
    @ManyToOne(cascade=CascadeType.ALL)
    private ShippingAdress shippingAdress;
	public ShippingAdress getShippingAdress() {
		return shippingAdress;
	}
	public void setShippingAdress(ShippingAdress shippingAdress) {
		this.shippingAdress = shippingAdress;
	}
}
