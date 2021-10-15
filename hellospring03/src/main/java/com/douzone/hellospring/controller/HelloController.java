package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 백엔드 컨트롤러
@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "/WEB-INF/views/hello.jsp";
	}
	
	@RequestMapping("/guestbook/list")
	public String hello2() {
		return "/WEB-INF/views/hello.jsp";
	}

	
}
