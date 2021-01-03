package com.guru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guru.consumer.CartRestConsumer;

@RestController
@RequestMapping("/payment")
public class PaymnetController {
	
	@Autowired
	private CartRestConsumer consumer;
	
	@RequestMapping("/info")
	public String echo() {
		return "EUREKA CLOUD PAYMENT SERVICE";
	}
	
	@GetMapping("/data")
	public String getPayData() {
		return "FROM PAYMENT ==> " + consumer.getCartInfo();
	}
}
