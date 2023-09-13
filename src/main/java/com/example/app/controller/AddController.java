package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController {
@RequestMapping("/addRegi")
	public String addRegi() {
	return "AddEnd";
}
}
