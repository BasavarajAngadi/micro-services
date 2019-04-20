package com.braj.goodsdiscountservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //For register service to eureka
public class GoodsDiscountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodsDiscountServiceApplication.class, args);
	}
 
}

