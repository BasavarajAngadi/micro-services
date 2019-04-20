package com.braj.goodsdiscountservice.enity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity(name="grocerydiscountprice")
public class GroceryDiscountPrice {
	@Id
	private Integer id;
	private Integer price;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
