package com.zhou.zwteurekaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ZwtEurekaProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZwtEurekaProviderApplication.class, args);
	}

}
