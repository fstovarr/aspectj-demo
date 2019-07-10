package com.aop.model;

import org.springframework.stereotype.Component;

@Component
public class Cat {
	
	public void talk() {
		System.out.println(this.getClass().getSimpleName() + ": Meow!");
	}
	
}
