package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/controller")
public class HomeController {

	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public String hello()
	{
		return "Hello";
	}
	
	@RequestMapping(value = {"/msg1","/msg2","/anything"},method = RequestMethod.GET)
	public String msg()
	{
		return "Demo";
	}
	
	@RequestMapping(value = "/print",method = RequestMethod.GET)
	@ResponseBody
	public String printMsg()
	{
		return "Study Hard Icompass is Coming";
	}
	
	@RequestMapping(value = "/model",method = RequestMethod.GET)
	public String param(Model model)
	{
		model.addAttribute("name","suyash");
		return "Demo";
	}
	
	
	@RequestMapping(value = "/motive",method = RequestMethod.GET)
	public ModelAndView printParam()
	{
		return new ModelAndView("Demo","xyz","Tanzil");
	}
	
	
	@RequestMapping(value = "/view" ,method = RequestMethod.GET)
	public ModelAndView addMsg()
	{
		ModelAndView modelandview = new ModelAndView();
		modelandview.addObject("Lion","Simba");
		modelandview.setViewName("Demo");
		return modelandview;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
