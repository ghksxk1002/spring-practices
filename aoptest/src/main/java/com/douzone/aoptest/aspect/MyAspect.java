package com.douzone.aoptest.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class MyAspect {
	
	// before 어드바이스
	@Before("execution(public com.douzone.aoptest.vo.ProductVo com.douzone.aoptest.service.ProductService.find(String))")
	public void beforeAdvice() {
		System.out.println("-----Before Advice----");
	}
	// After 어드바이스
	@After("execution(* *..*.ProductService.find(..))")
	public void afterAdvice() {
		System.out.println("-----After Advice----");
	}
	
	@AfterReturning("execution(* *..*.ProductService.*(..))")
	public void afterReturningAdvice() {
		System.out.println("-----AfterReturning Advice----");
	}
	
	@AfterThrowing(value="execution(* *..*.ProductService.*(..))", throwing="ex")
	public void afterThrowingAdvice(Throwable ex) {
		System.out.println("-----AfterThrowing Advice : "+ ex + "----");
	}
	
	@Around("execution(* *..*.ProductService.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		/*before */
		System.out.println("-----Around(Before) Advice----");
		
		// point cut 메소드 실행
		// 파라미터 가로 체기
		Object[] params = {"Camera"};
		
		Object result = pjp.proceed(params);
		
		/*After*/
		System.out.println("-----Around(After) Advice----");
	
		return result;
	}
	
}
