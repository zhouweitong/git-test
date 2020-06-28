package com.zhou.zwteurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ZwtEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZwtEurekaServerApplication.class, args);
	}

}
