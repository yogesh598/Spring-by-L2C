package com.injecting_values_from_propertiesfiles;
//# code modified at line 9
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.pack2.without_xml")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	//define the bean for sadFortuneService
	@Bean
	public FortuneService sadFortuneService(){
		return new SadFortuneService();
	}
	
	//define bean for swimCoach and inject dependencies
	@Bean
	public Coach swimCoach()
	{						 
		return new SwimCoach(sadFortuneService());
	}
}
