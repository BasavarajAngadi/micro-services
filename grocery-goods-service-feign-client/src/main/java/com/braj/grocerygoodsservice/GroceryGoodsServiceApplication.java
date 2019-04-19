package com.braj.grocerygoodsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
 
@SpringBootApplication
@EnableFeignClients("com.braj.grocerygoodsservice")
public class GroceryGoodsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroceryGoodsServiceApplication.class, args);
	}

}

