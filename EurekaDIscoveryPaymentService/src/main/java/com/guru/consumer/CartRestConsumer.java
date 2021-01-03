package com.guru.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class CartRestConsumer {

	//autowire disocvery client 
	/**
	 * we are autowiring the discoveryclient to get all instances running 
	 * and  (registered with EUREKA-SERVER).
	 * if we call getinstances will get list of instances by specified name
	 */
	@Autowired
	private DiscoveryClient client;
	
	public String getCartInfo() {
		// get ServiceInstance list using serviceId
		List<ServiceInstance> siList = client.getInstances("cart-service");
		
		System.out.println("Insatances of CART :: "+siList );
		
		//read manually one instace from index#0 
		ServiceInstance si = siList.get(0);
		
		//Read URI and Add path that returns url
		String url = si.getUri() +"/cart/info";
		
		// create object for RestTemplate
		RestTemplate rt = new RestTemplate();
		
		//make HTTP call and get Reponse data
		String response = rt.getForObject(url, String.class);
		
		// return response back to Consumer App RestController
		return response;
	}
}
