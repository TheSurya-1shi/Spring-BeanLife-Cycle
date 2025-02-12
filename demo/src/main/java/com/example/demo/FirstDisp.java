package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FirstDisp {
	
	@GetMapping("/")
	public String diplay() {
		
		System.out.println("Hellow World..!!");
		return "Hellow World";
	}

}
