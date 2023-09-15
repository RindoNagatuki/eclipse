package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.app.domain.Snsdata;
import com.example.app.mapper.SnsdataMapper;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MaerkRegisterController {

	private final SnsdataMapper mapper;
	
	@GetMapping("MaerkRegister")
	
	public String MaerkRegister (Model model) throws Exception{
		model.addAttribute("MaerkRegister");
		return "MaerkRegister";
	}
	
	@GetMapping("add")
	public String add (Model model)throws Exception{
		Snsdata snsdata = new Snsdata();
		model.addAttribute("snsdata",snsdata);
		return "add";
		
	}
	@PostMapping("add")
	public String add(@Valid Snsdata snsdata, Errors errors)throws Exception{
		if(errors.hasErrors()) {
			return "add";
		}
		mapper.add(snsdata);;
		return "redirect:add";
	}
	
	
	@RequestMapping("/MaerkRegister")
	public String showRegister() {

		return "redirect:maerkUp";
	}

}