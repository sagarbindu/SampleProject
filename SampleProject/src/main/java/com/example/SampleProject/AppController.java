package com.example.SampleProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping("/")
	public String sayHello() {
		
		return "Hi All";
	}

}
