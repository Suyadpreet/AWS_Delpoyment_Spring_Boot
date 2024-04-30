package com.suyad.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerClass 
{
	@GetMapping("/index")
	@ResponseBody
	public String welcomePage()
	{
		return "Welcome to my First AWS Cloud Application";
	}
}
