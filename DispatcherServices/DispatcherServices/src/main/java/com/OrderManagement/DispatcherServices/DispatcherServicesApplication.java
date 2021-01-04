package com.OrderManagement.DispatcherServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableFeignClients("com.OrderManagement.DispatcherServices")
public class DispatcherServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DispatcherServicesApplication.class, args);
	}

}
