package com.apurv.codashboard.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/dashboard")
public class ServiceController {
	
	
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET ,produces = "application/json" )
	@ResponseBody
	public String index() {
		System.out.println("index() is executed!");
		return "Hello world ";
	}
	
	
}
