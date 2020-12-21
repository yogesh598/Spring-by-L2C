package bean_initialization_and_destruction;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

	// define private field
	private FortuneService fortuneService;
	
	//define the constructor for dependency injection
	@Autowired
	public BaseballCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	
	public String getDailyWorkout()
	{
		return "Spend 60-min in batting practice";
	}

	@Override
	public String getDailyFortune() 
	{
		//use my FortuneService to get a fortune
		return fortuneService.getFortune();
	}

	//add @PostConstruct and @PreDerstroy annotations
	@PostConstruct
	public void doMyStartUpStuff()
	{
		System.out.println("Inside : BaseballCoach - doMyStartUpStuff() \n Bean just created");
	}
	@PreDestroy
	public void doMyCleanUpStuff()
	{
		System.out.println("Inside : BaseballCoach - doMyCleanUpStuff() \n Bean is about to destroy");
	}
}
