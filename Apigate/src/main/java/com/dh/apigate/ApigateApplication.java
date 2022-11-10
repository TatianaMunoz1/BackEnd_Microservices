package com.dh.apigate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDiscoveryClient
public class ApigateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApigateApplication.class, args);
	}

}
