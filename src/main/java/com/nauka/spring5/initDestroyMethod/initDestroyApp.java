package com.nauka.spring5.initDestroyMethod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class initDestroyApp {

	public static void main(String[] args) {
		//za�adowanie pliku konfiguracji
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//za�adowanie Bean'a z kontekstu
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//zamkni�cie kontekstu
		context.close();
	}
}
