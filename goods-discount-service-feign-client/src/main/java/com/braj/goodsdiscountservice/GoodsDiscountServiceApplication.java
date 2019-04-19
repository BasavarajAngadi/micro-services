package com.braj.goodsdiscountservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.braj.goodsdiscountservice")
public class GoodsDiscountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodsDiscountServiceApplication.class, args);
	}
 
}

