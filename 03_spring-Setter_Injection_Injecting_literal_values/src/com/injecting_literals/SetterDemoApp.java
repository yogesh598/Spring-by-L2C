package com.injecting_literals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		//retrieve bean from spring
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		//call methods on bean
		System.out.println(theCoach.getDailyWorkout());							
		System.out.println(theCoach.getDailyFortune());							
		System.out.println(theCoach.getEmailAddress());							
		System.out.println(theCoach.getTeam());							
		
		//close the context
		context.close();
	}

}
