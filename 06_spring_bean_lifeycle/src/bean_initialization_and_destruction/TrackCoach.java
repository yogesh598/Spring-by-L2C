package bean_initialization_and_destruction;

public class TrackCoach implements Coach {

	//define a private field
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() 
	{
		return "Run a hard 10k";
	}

	@Override
	public String getDailyFortune() 
	{
		return "This is your daily fortune and "+fortuneService.getFortune();
	}
	
	//add an init method
	public void doMyStartUpStuff()
	{
		System.out.println("TrackCoach : Inside method doMyStartUpStuff ");
	}
	
	//add a destroy method
	public void doMyCleanUpStuff()
	{
		System.out.println("TrackCoach : Inside method doMyCleanUpStuff ");
	}

}
