package com.srujana.eshopbackend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CatagoryTable")


public class Catagory {

	@Id
	private int catagoryId;
	private String catagoryName;
	private String catagoryDescription;
	public int getCatagoryId() {
		return catagoryId;
	}
	public void setCatagoryId(int catagoryId) {
		this.catagoryId = catagoryId;
	}
	public String getCatagoryName() {
		return catagoryName;
	}
	public void setCatagoryName(String catagoryName) {
		this.catagoryName = catagoryName;
	}
	public String getCatagoryDescription() {
		return catagoryDescription;
	}
	public void setCatagoryDescription(String catagoryDescription) {
		this.catagoryDescription = catagoryDescription;
	}
	
}
