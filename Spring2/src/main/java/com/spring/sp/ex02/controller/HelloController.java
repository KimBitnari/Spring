package com.spring.sp.ex02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView view = new ModelAndView();
		
		// View는 hello.jsp
		view.setViewName("hello");
		// [hello.jsp] ${name} = Lim
		view.addObject("name", "Lim");
		return view;
	}
	
	//Controller return type = ModelAndView
}
