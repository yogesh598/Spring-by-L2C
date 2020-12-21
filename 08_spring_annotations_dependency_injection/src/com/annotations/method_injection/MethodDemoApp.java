package com.annotations.method_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MethodDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("Method_Injection_ApplicationContext.xml");
		
		Coach theCoach = context.getBean("vollyBallCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyDiet());
		
		context.close();
	}

}
