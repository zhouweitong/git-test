package com.zhou.productsgatewayzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ProductsGatewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsGatewayZuulApplication.class, args);
	}

}
