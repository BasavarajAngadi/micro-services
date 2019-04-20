package com.braj.goodsdiscountservice.controller;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.braj.goodsdiscountservice.dto.DiscountPrice;
import com.braj.goodsdiscountservice.service.GoodsDiscountService;

@RestController
public class DiscountController {
	@Autowired
	private GoodsDiscountService goodsDiscountService;
	@Autowired
	private Environment environment;
	@GetMapping("/discount/{goodsType}/{itemId}")
	public Optional<DiscountPrice> getEDiscountedAmountByProductId(
			@PathVariable String goodsType, @PathVariable Integer itemId) {
       String currentPortNumber=environment.getProperty("local.server.port");
		Optional<DiscountPrice> dPrice = goodsDiscountService
				.getDiscountPrice(itemId, goodsType);
		dPrice.get().setServerPortNumber(currentPortNumber);
		if (dPrice.isPresent()) {
			System.out.println("Price :" + dPrice.get().getItemPrice());
			return dPrice;
		} else {
			dPrice.get().setItemId(2);
			dPrice.get().setItemPrice(2);
			dPrice.get().setItemName("currentPortNumber : "+currentPortNumber);
			
			return dPrice;
		}
	}

}
