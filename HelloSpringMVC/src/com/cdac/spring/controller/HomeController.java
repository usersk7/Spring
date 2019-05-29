package com.cdac.spring.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value="/index")
	public String getHomePage(Model model) {
		model.addAttribute("today", LocalDate.now());
		model.addAttribute("title", "Welcome to Spring MVC");
		return "index";//viewName
	}


}
