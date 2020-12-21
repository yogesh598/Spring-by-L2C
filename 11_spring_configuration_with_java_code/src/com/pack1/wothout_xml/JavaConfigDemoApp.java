//# code modified at line 12 and 13

package com.pack1.wothout_xml;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//load the class for configuration 
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//Retrieve the bean from the spring container
		Coach theCoach = context.getBean("baseballCoach",Coach.class);
		
		//call the methods on the beans
		System.out.println(theCoach.getDailyWorkout());
		
		//lets call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
		
	}

}
