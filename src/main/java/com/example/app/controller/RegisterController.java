package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.app.domain.Snsdata;
import com.example.app.mapper.SnsdataMapper;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class RegisterController {

	private final SnsdataMapper mapper;
	
	/* SNS情報登録・登録完了 */
	@GetMapping("/addSns")
	public String addSnsPage(Model model)throws Exception{
		Snsdata snsdata = new Snsdata();
		model.addAttribute("snsdata", snsdata);
		return "addSns";	
	}
	
	@PostMapping("/addSns")
	public String addSnsPage(@Valid Snsdata snsdata, Errors errors)throws Exception{
		System.out.println(snsdata);
		if(errors.hasErrors()) {
			return "addSns";
		}
		mapper.add(snsdata);;
		return "redirect:/addSnsEnd";
	}
	
	@GetMapping("/addSnsEnd")
	public String addSnsEndPage (){
		return "addSnsEnd";
		
	}
	
	
	/* フォローユーザー登録・登録完了 */
	@GetMapping("/addUser")
	public String addUserPage(Model model) throws Exception{
		Snsdata snsdata = new Snsdata();
		model.addAttribute("snsdata",snsdata);
		return "addUser";
	}
	
	@PostMapping("/addUser")
	public String addUserPage(@Valid Snsdata snsdata, Errors errors)throws Exception {
		System.out.println(snsdata);
		if(errors.hasErrors()) {
			return "addUser";
		}
		mapper.add(snsdata);
		return "redirect:/addUserEnd";
	}
	
	@GetMapping("/addUserEnd")
	public String addUserEndPage(){
		return "addUserEnd";
		
	}
	

}