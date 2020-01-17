package com.spring.sp.ex02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController3 {

	@RequestMapping("/hello3")
	@ResponseBody
	public String hello() {
		return "<html><body><h1>Hello, ResponseBody!</h1></body></html>";
	}
}
