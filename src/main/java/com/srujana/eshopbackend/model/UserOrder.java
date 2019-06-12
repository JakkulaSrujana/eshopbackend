package com.srujana.eshopbackend.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class UserOrder {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private Date date;
	private int grandTotal;
	@ManyToOne(cascade=CascadeType.ALL)
	private User user;
	@ManyToOne(cascade=CascadeType.ALL)
	private ShippingAdress shippingAdress;
	public ShippingAdress getShippingAdress() {
		return shippingAdress;
	}
	public void setShippingAdress(ShippingAdress shippingAdress) {
		this.shippingAdress = shippingAdress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(int grandTotal) {
		this.grandTotal = grandTotal;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
