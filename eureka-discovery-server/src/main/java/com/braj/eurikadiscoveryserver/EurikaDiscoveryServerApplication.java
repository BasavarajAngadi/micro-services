 package com.braj.eurikadiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurikaDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurikaDiscoveryServerApplication.class, args);
	}

}
