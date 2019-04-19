package com.braj.goodsdiscountservice.constants;

public enum GoodsType {
	
	ELECTONIC_GOODS("EGoods"),
	GROCERY_GOODS("GGoods");
	
	String Type;
	public String getType() {
		return Type;
	}
	
	GoodsType(String Type)
	{
		this.Type=Type;
	}
	

}
