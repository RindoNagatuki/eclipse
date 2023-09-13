package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/maerkRegister")
public class MaerkRegisterController {

	
	@GetMapping("/registration")
    public String showRegistrationForm() {
        return "registration"; // registration.htmlへのビュー名を返します
    }

    @PostMapping("/registration")
    public String processRegistrationForm(@RequestParam String name, 
								    	  @RequestParam String SNSname, 
								    	  @RequestParam String url,
								    	  Model model) {
        // フォームデータを処理するコードをここに追加します
        // 例: データベースに保存する、他のサービスと連携するなど

        return "redirect:/home.html"; // ホームページにリダイレクトします
    }
}
