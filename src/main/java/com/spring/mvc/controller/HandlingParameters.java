package com.spring.mvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
@RequestMapping("/param")
public class HandlingParameters {

	@RequestMapping(value = "/q",method = RequestMethod.GET)
	public String getParam(
			
		@RequestParam("fname") String firstname,
		@RequestParam("lname") String lastname
			
			)
	{
		System.out.println(firstname);
		System.out.println(lastname);
		return "Demo";
	}
	
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public String getInfo()
	{
		return "Info";
	}
	
	@RequestMapping(value = "/postparam",method = RequestMethod.POST)
	public String getParameters(
			
		@RequestParam("fname") String firstname,
		@RequestParam("lname") String lastname
			
			)
	{
		System.out.println(firstname);
		System.out.println(lastname);
		return "Demo";
	}
	
	@RequestMapping(value = "/path/{fname}/{lname}")
	public String printParam(
			
			@PathVariable("fname")String fname,
			@PathVariable("lname")String lname,
			Model model
			
			)
	{
		model.addAttribute("fname",fname);
		model.addAttribute("lname",lname);
		return "Demo";
	}
	
	
	
	
	
	
	
	
	
}
