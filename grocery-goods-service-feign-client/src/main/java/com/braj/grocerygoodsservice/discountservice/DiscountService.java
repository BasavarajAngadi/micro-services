package com.braj.grocerygoodsservice.discountservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.braj.grocerygoodsservice.dto.DiscountPrice;

@FeignClient(name = "goods-discount-service-feign-client", url = "localhost:4000")
public interface DiscountService {
	@GetMapping("/discount/{type}/{itemId}")
	public DiscountPrice getDiscountedAmountByProductId
	(@PathVariable("type") String type,@PathVariable("itemId") Integer itemId); 


}
