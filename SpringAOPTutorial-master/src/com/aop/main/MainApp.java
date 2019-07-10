package com.aop.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aop.model.Cat;
import com.aop.model.Dog;
import com.aop.model.EmailDAO;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		
		
		
		
		
		
		
		
		Dog dog = context.getBean("dog", Dog.class);
		Cat cat = context.getBean("cat", Cat.class);
		
		
		dog.talk();
		cat.talk();
		
		
		
		
		EmailDAO dao = context.getBean("emailDAO", EmailDAO.class);
		dao.saveEmail("agapito_pelaez<script>@gmail.com");
		
		
		
		
		
		
		
		
		
		context.close();
	}

}
