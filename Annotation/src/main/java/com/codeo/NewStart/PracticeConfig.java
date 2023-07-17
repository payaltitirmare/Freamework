package com.codeo.NewStart;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.codeo.NewStart")
@PropertySource("classpath:Practice.properties")
public class PracticeConfig {

	@Bean          //this is id     
      public Practice practiceBean()
	{
		Practice practice = new Practice();
		return practice;
	}
	
	
	
}
