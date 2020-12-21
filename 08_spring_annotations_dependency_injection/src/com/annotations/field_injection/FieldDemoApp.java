package com.annotations.field_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FieldDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("Field_Injection_ApplicationContext..xml");
		
		Coach theCoach = context.getBean("hockeyCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
