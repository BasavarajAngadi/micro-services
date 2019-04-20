  package com.braj.electronicgoodsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.braj.electronicgoodsservice")
//For register service to eureka
@EnableDiscoveryClient

@EnableHystrix
public class ElectronicGoodsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectronicGoodsServiceApplication.class, args);
	}

}

