//#constructor injection is done here
package com.annotations.default_constructor_injection;	

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	//load Spring config file
		public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext
				("Constructor_Injection_ApplicationContext.xml");
	
	//retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
	
	//call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		
	//call the new methods on the bean
		System.out.println(theCoach.getDailyFortune());
		
	//closing the context
		context.close();
	}
}
