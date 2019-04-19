package com.braj.goodsdiscountservice.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.braj.goodsdiscountservice.enity.ElectronicDiscountPrice;
@Repository
public interface ElectronicDiscountRateDao extends CrudRepository<ElectronicDiscountPrice, Integer> {
	Optional<ElectronicDiscountPrice> findById(Integer itemId);

}
