package com.guru.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {
	
	@RequestMapping("/info")
	public String echo() {
		return "EUREKA CLOUD CART SERVICE";
	}

}
