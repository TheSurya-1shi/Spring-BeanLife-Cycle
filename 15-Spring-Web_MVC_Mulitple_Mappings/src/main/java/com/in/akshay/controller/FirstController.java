package com.in.akshay.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
	
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {
		
		ModelAndView mvc = new ModelAndView();
		mvc.addObject("msg", "Welcome to Home Page !!");
		mvc.setViewName("index");
		return mvc;
	}
	
	@GetMapping("/greet")
	public ModelAndView getGreetings() {
		ModelAndView mvc = new ModelAndView();
		mvc.addObject("msg", "Hellow, How are You..?");
		mvc.setViewName("greet");
		return mvc;
	}
	
	@GetMapping("/time")
	public ModelAndView getTime() {
		ModelAndView mvc = new ModelAndView();
		LocalDateTime localDateTime =  LocalDateTime.now();
		mvc.addObject("msg", localDateTime);
		mvc.setViewName("time");
		return mvc;
	}

}
