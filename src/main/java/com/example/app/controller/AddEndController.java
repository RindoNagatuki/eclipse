package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AddEndController {
	
	@RequestMapping("/addEnd")
		public String addRegiEnd() {
		return "AddEnd";
	}
}
