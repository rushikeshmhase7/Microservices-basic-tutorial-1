package com.yash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductRatingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductRatingsApplication.class, args);
	}

}
