package com.braj.productservice.entity;

public class ProductInfo {

	private String name;
	private Integer price;
	private String type;
	public ProductInfo(String name, Integer price, String type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}

	
	protected  ProductInfo(){}
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
