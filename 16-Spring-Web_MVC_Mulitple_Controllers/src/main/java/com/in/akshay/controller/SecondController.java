package com.in.akshay.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecondController {
	
	@GetMapping("/greet")
	public ModelAndView getGreeting() {
		ModelAndView mvc = new ModelAndView();
		mvc.addObject("msg", "Good Morning !!");
		mvc.setViewName("greet");
		return mvc;
		
	}
	
	@GetMapping("/time")
	public ModelAndView getTime() {
		ModelAndView mvc = new ModelAndView();
		LocalDateTime now = LocalDateTime.now();
		mvc.addObject("msg", now);
		mvc.setViewName("time");
		return mvc;
		
	}
	
	@GetMapping("/menu")
	public ModelAndView getMenu() {
		ModelAndView mvc = new ModelAndView();
		mvc.addObject("msg", "Poli-Bhaaji-Daal-Rice");
		mvc.setViewName("menu");
		return mvc;
		
	}
	
	

}
