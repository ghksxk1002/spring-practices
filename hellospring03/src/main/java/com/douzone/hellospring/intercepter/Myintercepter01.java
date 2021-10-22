package com.douzone.hellospring.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Myintercepter01 implements HandlerInterceptor {

	@Override
	// 순서 1
	// 헨들러가 실행되지전 컨트롤러의 핸들러 맵핑 정보중에 @Auth 의 존제를 파악하고 있으면 검사 없으면 통과 -> 인증이 필요하다고
	// 그 메소드에 어노테이션을 달아놓는다
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("myinyerceptor01.praHandel()...call");
		return false;
	}

	// 2 : 컨트롤러에서 쿠키를 굽게 되면 사용함
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("myinyerceptor01.postHandel()..call");
	}

	// 3
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("myinyerceptor01.afterHandel()...call");
	}

}
