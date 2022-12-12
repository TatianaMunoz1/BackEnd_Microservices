package com.dh.serie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@EnableEurekaClient
@SpringBootApplication
public class SerieServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SerieServiceApplication.class, args);
	}

}
