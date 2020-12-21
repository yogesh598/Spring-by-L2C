package singleton_and_prototype;	//setter injection_properties_file

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//new properties
	private String emailAddress;
	private String team;
		
	//creating a setter, called by spring for injecting 
	public void setFortuneService(FortuneService fortuneService) 
	{
		this.fortuneService = fortuneService;
	}
	
	//creating a setters and getters for newly created properties
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice fast bolwing for 1 hour a day";
	}	

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
