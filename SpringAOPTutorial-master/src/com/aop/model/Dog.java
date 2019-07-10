package com.aop.model;

import org.springframework.stereotype.Component;

@Component
public class Dog {
	
	public void talk() {
		System.out.println(this.getClass().getSimpleName() + ": Bark!");
	}

}
