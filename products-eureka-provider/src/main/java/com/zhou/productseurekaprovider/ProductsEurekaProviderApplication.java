package com.zhou.productseurekaprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.zhou.productseurekaprovider.mapper")
public class ProductsEurekaProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsEurekaProviderApplication.class, args);
	}

}
