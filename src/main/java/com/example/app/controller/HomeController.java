package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("home")
public class HomeController {

	public String home() {
		return "home";
	}

	@PostMapping
	public String processRegistrationForm(
			@RequestParam String name,
			@RequestParam String SNSname,
			@RequestParam String url) {

		return "home";

	}
}
