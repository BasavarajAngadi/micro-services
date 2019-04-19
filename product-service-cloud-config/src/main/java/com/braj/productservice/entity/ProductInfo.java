package com.braj.productservice.entity;

public class ProductInfo {

	private String name;
    private Integer price;
	private String type;
	private String productOwnerName;
	private String productEmailAddress;

	public ProductInfo(String name, Integer price, String type,
			String productOwnerName, String productEmailAddress) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
		this.productOwnerName = productOwnerName;
		this.productEmailAddress = productEmailAddress;
	}

	public String getProductOwnerName() {
		return productOwnerName;
	}

	public void setProductOwnerName(String productOwnerName) {
		this.productOwnerName = productOwnerName;
	}

	public String getProductEmailAddress() {
		return productEmailAddress;
	}

	public void setProductEmailAddress(String productEmailAddress) {
		this.productEmailAddress = productEmailAddress;
	}

	protected ProductInfo() {
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
