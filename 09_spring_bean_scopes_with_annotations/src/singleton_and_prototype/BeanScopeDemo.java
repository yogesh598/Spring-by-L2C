package singleton_and_prototype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {

		//load spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("baseballCoach",Coach.class);
		Coach alphaCoach = context.getBean("baseballCoach",Coach.class);
		
		//check the beans references
		boolean result = (theCoach ==alphaCoach);
		
		//print out the results
		System.out.println("Pointing to the same object ? :"+result);
		System.out.println("Memory location of theCoach : "+theCoach);
		System.out.println("Memory location of alphaCoach : "+alphaCoach);
		
		//closing the context
		context.close();
	}
}