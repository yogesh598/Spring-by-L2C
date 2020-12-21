package bean_initialization_and_destruction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("BeanLifeCycle_ApplicationContext.xml");
		
		//Retrieve the bean from the spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		//call the methods on the beans
		System.out.println(theCoach.getDailyWorkout());
		
		//lets call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
		
	}

}
