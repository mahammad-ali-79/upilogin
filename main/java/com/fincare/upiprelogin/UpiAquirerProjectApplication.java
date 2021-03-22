package com.fincare.upiprelogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UpiAquirerProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpiAquirerProjectApplication.class, args);
	}

}