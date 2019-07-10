package com.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(2)
@Component
public class TalkAspect {

	//@Before("execution(public void com.aop.model.*.talk())")
	@Before("execution(* talk())")
	public void beforeTalkAdvice() {
		System.out.println(" - An animal will talk...");
	}
	
	@After("execution(* talk())")
	public void afterTalkAdvice() {
		System.out.println(" - An animal did talk...\n");
	}
	
	@Around("execution(* talk())")
	public void aroundTalkAdvice(ProceedingJoinPoint procceedingJoinPoint) {
		System.out.println(" - An animal will talk...(around)");
		
		try {
			procceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println(" - An animal did talk...(around)");
	}
	
}
