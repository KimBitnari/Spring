package com.spring.sp.ex02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController2 {

	@RequestMapping("/hello2")
	public String hello() {
		// View는 hello.jsp
		return "hello2";
	}
	
	//Controller return type = String
}
