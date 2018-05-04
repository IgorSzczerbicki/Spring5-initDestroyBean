package com.nauka.spring5.initDestroyMethod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class initDestroyApp {

	public static void main(String[] args) {
		//za³adowanie pliku konfiguracji
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//za³adowanie Bean'a z kontekstu
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//zamkniêcie kontekstu
		context.close();
	}
}
