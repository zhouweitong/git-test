package com.zhou.blogeurekaprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.zhou.blogeurekaprovider.mapper")
public class BlogEurekaProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogEurekaProviderApplication.class, args);
	}

}
