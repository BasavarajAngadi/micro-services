package com.braj.goodsdiscountservice.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.braj.goodsdiscountservice.constants.GoodsType;
import com.braj.goodsdiscountservice.dao.ElectronicDiscountRateDao;
import com.braj.goodsdiscountservice.dao.GroceryDiscountRateDao;
import com.braj.goodsdiscountservice.dto.DiscountPrice;
import com.braj.goodsdiscountservice.enity.ElectronicDiscountPrice;
import com.braj.goodsdiscountservice.enity.GroceryDiscountPrice;
import com.braj.goodsdiscountservice.service.GoodsDiscountService;

@Service
public class GoodsDiscountServiceImpl implements GoodsDiscountService {
	@Autowired
	private ElectronicDiscountRateDao electronicDiscountRateDao;
	@Autowired
	private GroceryDiscountRateDao groceryDiscountRateDao;
    @Override
	public Optional<DiscountPrice> getDiscountPrice(Integer itemId,
			String goodsType) {
		if (GoodsType.ELECTONIC_GOODS.getType().equals(goodsType)) {
			return getElectronicDiscount(itemId);
		} else {
			return getGroceryDiscount(itemId);
		}
	}

	private Optional<DiscountPrice> getElectronicDiscount(Integer itemId) {
		DiscountPrice discountPrice = new DiscountPrice();
		Optional<ElectronicDiscountPrice> electronic=Optional.empty();
		
		electronic = electronicDiscountRateDao
				.findById(itemId);
		if(electronic.isPresent()){
			discountPrice.setItemId(electronic.get().getId());
			discountPrice.setItemName(electronic.get().getName());
			discountPrice.setItemPrice(electronic.get().getPrice());
		return Optional.of(discountPrice);
		}
		
		else
		{
			discountPrice.setItemId(2);
			discountPrice.setItemName("xyz");
			discountPrice.setItemPrice(2);
			
			return Optional.of(discountPrice);
		}

	}

	private Optional<DiscountPrice> getGroceryDiscount(Integer itemId) {
		DiscountPrice discountPrice = new DiscountPrice();
		Optional<GroceryDiscountPrice> electronic = groceryDiscountRateDao.findById(itemId);
		discountPrice.setItemId(electronic.get().getId());
		discountPrice.setItemName(electronic.get().getName());
		discountPrice.setItemPrice(electronic.get().getPrice());
		return Optional.of(discountPrice);

	}

}
