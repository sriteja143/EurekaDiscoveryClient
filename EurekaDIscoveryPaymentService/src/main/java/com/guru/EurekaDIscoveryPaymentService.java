package com.guru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaDIscoveryPaymentService {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDIscoveryPaymentService.class, args);
	}

}
