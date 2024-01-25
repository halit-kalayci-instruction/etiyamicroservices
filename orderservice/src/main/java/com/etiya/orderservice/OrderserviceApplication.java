package com.etiya.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
// @EnableEurekaClient Spring Cloud 2022.0.4 ihtiyaç ortadan kalktı.
public class OrderserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderserviceApplication.class, args);
	}

}

// Netflix Ribbon
// Cloud Load Balancer
