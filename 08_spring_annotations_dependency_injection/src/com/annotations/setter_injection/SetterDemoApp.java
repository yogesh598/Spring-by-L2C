//#Setter injection is done here
package com.annotations.setter_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		//load config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
				("Setter_Injection_ApplicationContext.xml"); 
		
		//retrieve the bean from container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		//call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}	
}
