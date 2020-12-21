package singleton_and_prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BaseballCoach implements Coach{

	// define private field
	private FortuneService fortuneService;
	
	//define the constructor for dependency injection
	@Autowired
	public BaseballCoach(@Qualifier("happyFortuneService")FortuneService theFortuneService)
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

}
