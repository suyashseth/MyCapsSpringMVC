package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/controller")
public class HomeController {

	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public String hello()
	{
		return "Hello";
	}
}
