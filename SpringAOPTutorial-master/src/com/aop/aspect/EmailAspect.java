package com.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmailAspect {

	@Before("execution(* saveEmail(..))")
	public void beforeSaveEmailAdvice(JoinPoint joinPoint) {
		
		Object[] args = joinPoint.getArgs();
		
		if (args[0] != null) {
			String email = (String)args[0];
			if (email.contains("<script>")) {
				throw new RuntimeException(" - Possible hack on email: " + email);
			} else {
				System.out.println(" - Email validated.");
			}
		}		
		
	}
	
}
