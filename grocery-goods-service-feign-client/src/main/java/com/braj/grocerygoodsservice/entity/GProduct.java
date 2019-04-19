package com.braj.grocerygoodsservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="grocery_goods")
public class GProduct {
	@Id
	Integer id;
	String name;
	Integer price;
	GProduct()
	{
		
	}
	
	public GProduct(Integer id, String name, Integer price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
}
