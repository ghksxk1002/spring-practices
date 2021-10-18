package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 *  @auther user
 *  클래스(타입) 단독 매핑
 */
@Controller
@RequestMapping("/guestbook/*") // 모든 매소드 이름을 다음 url로 매핑하겠다
public class GuestBookController {
	
	
	@ResponseBody
	@RequestMapping
	public String list() {
		return "GuestBookController.list()";
	}
	
	@ResponseBody
	@RequestMapping
	public String delete() {
		return "GuestBookController.delete()";
	}
	
}
