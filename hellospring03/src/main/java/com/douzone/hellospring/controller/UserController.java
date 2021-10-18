package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/*
 * @auther user
 * 
 * @RequestMapping 클래스(타입) + 핸들러(메소드)
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	
	@RequestMapping(value="/join", method=RequestMethod.GET) // join url중 get 방식으로 받는것
	public String join() {
		return "/WEB-INF/views/join.jsp";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST) // join url중 get 방식으로 받는것
	public String join(UserVo vo) {
		//UserDao.insert(vo);
		return "rediract:/";
	}
	
	@ResponseBody
	@RequestMapping("/update")
	public String update(@RequestParam("n") String name) {
		/*
		 * 만약에 n 이라는 이름의 파라미터가 없는 경우
		 * 400  bad request 에러가 발생한다
		 */
		// 파라미터로 넘어오는 값이 n 인데 나는 name 으로 쓰고 싶을때
		System.out.println(name);
		return "UserController.update()";
	}
	
	@ResponseBody
	@RequestMapping("/update2")
	public String update2(
			@RequestParam(value="n", required=true, defaultValue="") String name, 
			@RequestParam(value="a", required=true, defaultValue="0") int age) { // required 값이 들어와야하는지 안들어와도 되는지 설정
		/*
		 * 만약에 n 이라는 이름의 파라미터가 없는 경우
		 * 400  bad request 에러가 발생한다
		 */
		// 파라미터로 넘어오는 값이 n 인데 나는 name 으로 쓰고 싶을때
		System.out.println("-------"+name+"-----");
		System.out.println("-------"+age+"-----");
		return "UserController.update()"+name;
	}
	
	
	
}
