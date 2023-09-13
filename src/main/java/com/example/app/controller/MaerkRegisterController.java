package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MaerkRegisterController {

	@RequestMapping("/MaerkRegister")
	public String showRegister() {

		return "MaerkRegister";
	}

}