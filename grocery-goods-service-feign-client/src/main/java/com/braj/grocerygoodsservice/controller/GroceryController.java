package com.braj.grocerygoodsservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.braj.grocerygoodsservice.discountservice.DiscountService;
import com.braj.grocerygoodsservice.dto.DiscountPrice;
import com.braj.grocerygoodsservice.entity.GProduct;
import com.braj.grocerygoodsservice.services.GroceryProductService;

@RestController
public class GroceryController {
	@Autowired
	GroceryProductService groceryProductService;
	@Autowired
	DiscountService discountService;

	@GetMapping("/grocery")
	public List<GProduct> getGroceryDetails() {

		return groceryProductService.getAllGroceryProduct();
	}
	
	@GetMapping("/grocery/{itemId}")
	public GProduct getDiscountedRateByItemId(@PathVariable Integer itemId) {
		DiscountPrice discountPrice = discountService.getDiscountedAmountByProductId("GGoods", itemId);
		System.out.println("discountedAmount" + discountPrice.getItemPrice());
		return new GProduct(2, "Mobile", discountPrice.getItemPrice());

	}

}
