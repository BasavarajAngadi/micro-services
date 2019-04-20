package com.braj.electronicgoodsservice.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.braj.electronicgoodsservice.entity.EProduct;
@Repository
public interface ElectronicGoodsDao extends CrudRepository<EProduct, Integer> {
	public List<EProduct> findAll();

}
