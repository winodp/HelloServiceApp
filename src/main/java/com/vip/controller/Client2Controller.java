package com.vip.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Client2Controller {
	
	@GetMapping("/getdata")
	public String getClient2Details() {
		System.out.println("Changes done in Hello app");
		return "welcome to Hello App...";
	}

}
