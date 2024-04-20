package com.proj.plantshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
	
	@RequestMapping("/")
	public String main(Model model) {
		model.addAttribute("data", "test");
		return "index";
	}
	
	@RequestMapping("/pay/pay")
	public String pay(Model model) {
//		model.addAttribute()
		return "/pay/pay";
	}
}
