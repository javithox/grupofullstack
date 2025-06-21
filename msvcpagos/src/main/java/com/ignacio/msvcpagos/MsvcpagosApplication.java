package com.ignacio.msvcpagos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsvcpagosApplication {
	public static void main(String[] args) {
		SpringApplication.run(MsvcpagosApplication.class, args);
	}
}
