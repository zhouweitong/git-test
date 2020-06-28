package com.zhou.housestenancy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhou.housestenancy.mapper")
public class HousesTenancyApplication {

	public static void main(String[] args) {
		SpringApplication.run(HousesTenancyApplication.class, args);
	}

}
