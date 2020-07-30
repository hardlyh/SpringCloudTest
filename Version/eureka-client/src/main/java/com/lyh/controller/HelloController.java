package com.lyh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
	
	@Autowired
	DiscoveryClient dv;
	
	@RequestMapping("/hello")
	public String hello() {
		ServiceInstance localServiceInstance = dv.getLocalServiceInstance();
		return "this is eureka client";
	}

}