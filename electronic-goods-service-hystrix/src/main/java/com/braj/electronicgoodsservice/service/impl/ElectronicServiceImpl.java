package com.braj.electronicgoodsservice.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.braj.electronicgoodsservice.dao.ElectronicGoodsDao;
import com.braj.electronicgoodsservice.discountservice.DiscountService;
import com.braj.electronicgoodsservice.dto.DiscountPrice;
import com.braj.electronicgoodsservice.entity.EProduct;
import com.braj.electronicgoodsservice.service.ElectronicService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@Service
public class ElectronicServiceImpl implements ElectronicService {
	@Autowired
	DiscountService discountService;
	
	@Autowired
	ElectronicGoodsDao electronicGoodsDao;
	@Override
	public List<EProduct> getAllElectronicsDetails() {
		
		return electronicGoodsDao.findAll();
	}
	
	
	@HystrixCommand(fallbackMethod="fallBackDiscountedMethod")
	@Override
	public DiscountPrice getDiscountedAmountByProductId(String type, Integer itemId) {
		
		DiscountPrice discountPrice = discountService
				.getDiscountedAmountByProductId("EGoods", itemId);
		
		return discountPrice;
	}
	
	public DiscountPrice fallBackDiscountedMethod(String type, Integer itemId) {
		DiscountPrice discountPrice=new DiscountPrice();
		discountPrice.setItemId(2);
		discountPrice.setItemName("fallBack");
		discountPrice.setItemPrice(400);
		return discountPrice;
		
		
	}
	

}
