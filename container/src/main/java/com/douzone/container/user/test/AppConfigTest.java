package com.douzone.container.user.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.douzone.container.config.user.AppConfig01;
import com.douzone.container.config.user.AppConfig02;
import com.douzone.container.user.User;

public class AppConfigTest {

	public static void main(String[] args) {
		//testAppConfig01();
		testAppConfig02();
	}
	
	// java Config 01
	// 자바 설정 클래스가 있는 베이스 패키지 전달
	// 설정 클래스에 @Configuration가 반드시 필요하다
	private static void testAppConfig02() {

		// 컨테이나 생성
		ApplicationContext ac = new AnnotationConfigApplicationContext("com.douzone.container.config.user");

		// ac 에게 bean 하나 달라고 하기
		User user = ac.getBean(User.class);
		System.out.println(user);
	}
	// java Config 01
	// 직접 자바클래스(config class) 전달
	// 설정 클래스 @Configuration
	private static void testAppConfig01() {

		// 컨테이나 생성
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig01.class);

		// ac 에게 bean 하나 달라고 하기
		User user = ac.getBean(User.class);
		System.out.println(user);
	}
}
