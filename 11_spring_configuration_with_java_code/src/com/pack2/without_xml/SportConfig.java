package com.pack2.without_xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.luv2code.pack2.without_xml")
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
