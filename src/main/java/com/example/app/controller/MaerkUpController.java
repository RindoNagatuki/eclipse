package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MaerkUpController {

	@RequestMapping("/maerkUp")
	public String homePage() {
		return "maerkUp";
	}

}
