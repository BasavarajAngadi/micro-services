package com.braj.goodsdiscountservice.service;

import java.util.Optional;

import com.braj.goodsdiscountservice.dto.DiscountPrice;

public interface GoodsDiscountService {
	
	Optional<DiscountPrice> getDiscountPrice(Integer itemId,String goodsType);
	
   

}
