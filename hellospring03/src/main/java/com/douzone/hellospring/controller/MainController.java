package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 클래스 단독 맵핑도 가능하다
@Controller
public class MainController {
	
	// main 페이지를 보여주기위한 메소드
	@ResponseBody
	@RequestMapping({"", "/main", "/main/a/b/c/d"}) // url을 복수 매핑이 가능하다
	public String Main() {
		
		return "MainController.Main()";
	}
}
