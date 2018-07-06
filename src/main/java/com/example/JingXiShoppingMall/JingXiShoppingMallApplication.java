package com.example.JingXiShoppingMall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class JingXiShoppingMallApplication {

	public static void main(String[] args) {
		System.out.println(new Date());
		SpringApplication.run(JingXiShoppingMallApplication.class, args);
	}
}
