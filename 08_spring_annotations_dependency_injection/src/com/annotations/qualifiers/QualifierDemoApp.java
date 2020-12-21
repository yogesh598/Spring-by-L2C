package com.annotations.qualifiers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QualifierDemoApp {

	public static void main(String[] args) {

	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
			("Qualifier_ApplicationContext.xml");
	
	Coach theCoach = context.getBean("tennisCoach",Coach.class);
	
	System.out.println(theCoach.getDailyFortune());
	System.out.println(theCoach.getDailyWorkout());
	
	context.close();
	}

}
