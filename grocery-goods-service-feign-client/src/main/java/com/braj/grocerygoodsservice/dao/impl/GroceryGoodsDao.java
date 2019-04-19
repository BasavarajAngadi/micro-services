package com.braj.grocerygoodsservice.dao.impl;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.braj.grocerygoodsservice.entity.GProduct;

@Repository
public interface GroceryGoodsDao extends CrudRepository<GProduct, Integer> {
	public List<GProduct> findAll();

}
