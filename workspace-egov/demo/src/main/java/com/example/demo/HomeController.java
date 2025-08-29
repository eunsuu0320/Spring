package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // node 의 router 와 같은 방식
public class HomeController {
	
	@Autowired // 담은 객체를 사용
	Animal animal;

	@GetMapping("/")
	@ResponseBody
	public String home() {
		animal.sound();
		return "hello";
	}

	@GetMapping("/main")
	public String main() {
		return "main"; // templates/main.html
	}
}
