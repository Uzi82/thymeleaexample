package com.defaultproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping
public class HomeController {
	@GetMapping
	public String index() {
		return "/home";
	}
	@GetMapping("/hello")
	public String getMethodName(@RequestParam("name") String name,
								@RequestParam("surname") String surname,
								Model model) {
		model.addAttribute("name", name + " " + surname);
		return "/hello";
	}
}
