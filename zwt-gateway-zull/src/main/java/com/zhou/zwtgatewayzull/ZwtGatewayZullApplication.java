package com.zhou.zwtgatewayzull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZwtGatewayZullApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZwtGatewayZullApplication.class, args);
	}

}
