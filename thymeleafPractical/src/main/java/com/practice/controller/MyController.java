package com.practice.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value="/about", method=RequestMethod.GET)
	public String about(Model m)
	{
		System.out.println("inside about handler..");
		
		m.addAttribute("name","payal titirmare");
		m.addAttribute("currentDate",new Date().toLocaleString());
		return "about";
	}
	
	
	
}
