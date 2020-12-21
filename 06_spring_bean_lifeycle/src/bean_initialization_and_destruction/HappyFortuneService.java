package bean_initialization_and_destruction;

public class HappyFortuneService implements FortuneService 
{
	@Override
	public String getFortune() 
	{
		return "Today is your luckey day!!";
	}

}
