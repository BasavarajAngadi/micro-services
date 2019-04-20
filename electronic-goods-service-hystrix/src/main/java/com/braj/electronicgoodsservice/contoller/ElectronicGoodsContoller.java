package com.braj.electronicgoodsservice.contoller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.braj.electronicgoodsservice.discountservice.DiscountService;
import com.braj.electronicgoodsservice.dto.DiscountPrice;
import com.braj.electronicgoodsservice.entity.EProduct;
import com.braj.electronicgoodsservice.service.ElectronicService;

@RestController
public class ElectronicGoodsContoller {

	@Autowired
	DiscountService discountService;

	@Autowired
	ElectronicService electronicService;
	

	@GetMapping("/electronic/{itemId}")
	public EProduct getDiscountedRateByItemId(@PathVariable Integer itemId) {
		Optional<DiscountPrice> discountPrice = Optional.of(discountService
				.getDiscountedAmountByProductId("EGoods", itemId));
		Integer discouPrice = 0;
		if (discountPrice.isPresent())
			discouPrice = discountPrice.get().getItemPrice();
		System.out.println("discountedAmount" + discouPrice);
		return new EProduct(2, "Mobile" + discountPrice.get().getItemName(),
				discouPrice);

	}

	@GetMapping("/hysterix/electronic/{itemId}")
	public EProduct getHysterixDiscRateByItemId(@PathVariable Integer itemId) {
			Optional<DiscountPrice> discountPrice = Optional.of(electronicService.getDiscountedAmountByProductId("EGoods", itemId));
		
		Integer discouPrice = 0;
		if (discountPrice.isPresent())
			discouPrice = discountPrice.get().getItemPrice();
		System.out.println("discountedAmount" + discouPrice);
		return new EProduct(2, "Mobile" + discountPrice.get().getItemName(),
				discouPrice);

	}
}
