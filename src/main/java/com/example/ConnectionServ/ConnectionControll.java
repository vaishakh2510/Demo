package com.example.ConnectionServ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConnectionControll {
	
	@Autowired
	ConnectionService accService;
	
	@GetMapping(path="/getAccount")
	public String getAccountDetails() {
		return accService.getAccounts();
	}
	
	@GetMapping("/message")
	public String getMessage() {
		return "hello";
	}
	@GetMapping("/loop")
	public String loopi(@RequestParam String name) {
		return "hai "+name;
	}
	
}