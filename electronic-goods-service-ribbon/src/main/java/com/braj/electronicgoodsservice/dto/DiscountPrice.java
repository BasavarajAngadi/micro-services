package com.braj.electronicgoodsservice.dto;

public class DiscountPrice {

	Integer itemId;
	String itemName;
	Integer itemPrice;
	String serverPortNumber;
	public String getServerPortNumber() {
		return serverPortNumber;
	}
	public void setServerPortNumber(String serverPortNumber) {
		this.serverPortNumber = serverPortNumber;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Integer getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Integer itemPrice) {
		this.itemPrice = itemPrice;
	}


}
