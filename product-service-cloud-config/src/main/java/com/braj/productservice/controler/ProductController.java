package com.braj.productservice.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.braj.productservice.configuration.AppConfiguration;
import com.braj.productservice.entity.ProductInfo;

@RestController
public class ProductController {
	@Autowired
	AppConfiguration appConfiguration;

	@GetMapping("/products")
	public ProductInfo getAllProductDetails() {
		System.out.println("contact name:"+appConfiguration.getName());
		System.out.println("contact name:"+appConfiguration.getEmail());
		return new ProductInfo("Mobile", 22, "Electronic");

	}

}
