package com.javaconfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class HelloWorld {

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String sayHello(ModelMap model) {
		System.out.println("Spring Java Configuration");
		//model.addAttribute("greeting", "Hello World from Spring 4 MVC");
		return "welcome";
	}
}
