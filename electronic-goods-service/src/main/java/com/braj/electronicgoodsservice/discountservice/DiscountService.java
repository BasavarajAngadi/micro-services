package com.braj.electronicgoodsservice.discountservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.braj.electronicgoodsservice.dto.DiscountPrice;

@FeignClient(name="goods-discount-service",url="localhost:4000")
//@FeignClient(name="goods-discount-service")
@RibbonClient(name="goods-discount-service")//Client Side Load Balancing
public interface DiscountService {
	@GetMapping("/discount/{type}/{itemId}")
	public DiscountPrice getDiscountedAmountByProductId
	(@PathVariable("type") String type,@PathVariable("itemId") Integer itemId); 


}
