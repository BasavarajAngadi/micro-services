package com.braj.electronicgoodsservice.pojo;

import javax.persistence.Id;

public class ElectronicProductDetails {
	@Id
	Integer id;
	String name;
	String serverPortNumber;
	Integer price;

	public ElectronicProductDetails(Integer id, String name, Integer price,
			String serverPortNumber) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.serverPortNumber = serverPortNumber;
	}

	public String getServerPortNumber() {
		return serverPortNumber;
	}

	public void setServerPortNumber(String serverPortNumber) {
		this.serverPortNumber = serverPortNumber;
	}

	ElectronicProductDetails() {

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
