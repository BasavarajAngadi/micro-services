package com.braj.grocerygoodsservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.braj.grocerygoodsservice.dao.impl.GroceryGoodsDao;
import com.braj.grocerygoodsservice.entity.GProduct;
import com.braj.grocerygoodsservice.services.GroceryProductService;
@Service
public class GroceryProductServiceImpl implements GroceryProductService {
    @Autowired
	GroceryGoodsDao groceryGoodsDao;
	
	@Override
	public List<GProduct> getAllGroceryProduct() {
		
		return groceryGoodsDao.findAll();
	}

}
