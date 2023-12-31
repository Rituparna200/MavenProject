package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloWorldController {
	String message = "Hello ";
 
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, 
			defaultValue = "World") String name) {
 
		ModelAndView mv = new ModelAndView("helloWorld");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
}
