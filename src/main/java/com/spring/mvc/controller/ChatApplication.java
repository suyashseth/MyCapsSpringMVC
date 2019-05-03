package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/app")
public class ChatApplication {

	
	@RequestMapping(value = "/chat", method = RequestMethod.GET)
	public String app()
	{
		return "Page";
	}
	
	@RequestMapping(value = "/chatting", method = RequestMethod.POST)
	public String chat(
			@RequestParam("msg") String msg,
			Model model
			)
	{
        System.out.println(msg);
		return "Chat";
	}
}
