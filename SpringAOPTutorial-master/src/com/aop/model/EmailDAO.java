package com.aop.model;

import org.springframework.stereotype.Component;

@Component
public class EmailDAO {
	
	public void saveEmail(String email) {
		System.out.println("Email saved!");
	}

}
