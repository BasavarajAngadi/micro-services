package com.braj.electronicgoodsservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.braj.electronicgoodsservice.dao.ElectronicGoodsDao;
import com.braj.electronicgoodsservice.entity.EProduct;
import com.braj.electronicgoodsservice.service.ElectronicService;


@Service
public class ElectronicServiceImpl implements ElectronicService {
	@Autowired
	ElectronicGoodsDao electronicGoodsDao;
	@Override
	public List<EProduct> getAllElectronicsDetails() {
		
		return electronicGoodsDao.findAll();
	}

}
