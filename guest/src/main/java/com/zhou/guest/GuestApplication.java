package com.zhou.guest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhou.guest.mapper")
public class GuestApplication {
	public static void main(String[] args) {
		SpringApplication.run(GuestApplication.class, args);
	}
}
