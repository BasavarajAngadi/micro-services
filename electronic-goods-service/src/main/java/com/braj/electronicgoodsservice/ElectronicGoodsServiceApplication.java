  package com.braj.electronicgoodsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.braj.electronicgoodsservice")
public class ElectronicGoodsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectronicGoodsServiceApplication.class, args);
	}

}

