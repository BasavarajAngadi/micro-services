package com.braj.electronicgoodsservice.service;

import java.util.List;

import com.braj.electronicgoodsservice.dto.DiscountPrice;
import com.braj.electronicgoodsservice.entity.EProduct;

public interface ElectronicService {
	
	List<EProduct>getAllElectronicsDetails();
	DiscountPrice getDiscountedAmountByProductId(String type, Integer itemId);
	

}
