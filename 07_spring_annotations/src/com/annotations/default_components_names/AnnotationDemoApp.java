package com.annotations.default_components_names;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	//load Spring config file
		public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext
				("DefaultComponentNames_ApplicationContext.xml");
	
	//retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
	
		
	//call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		
	//closing the context
		context.close();
	}
}
