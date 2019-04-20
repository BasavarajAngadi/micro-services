package com.braj.goodsdiscountservice.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.braj.goodsdiscountservice.enity.GroceryDiscountPrice;
@Repository
public interface GroceryDiscountRateDao extends CrudRepository<GroceryDiscountPrice, Integer> {
	Optional<GroceryDiscountPrice> findById(Integer itemId);


}
