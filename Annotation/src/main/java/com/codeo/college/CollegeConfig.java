package com.codeo.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.codeo.college")
@PropertySource("classpath:Class.properties")

public class CollegeConfig {

	
	  @Bean
	  public Principal princibean() 
	  { Principal principal= new Principal();
	  return principal; 
	  }
	  
	 
	  
		/*
		 * @Bean public College collegeBean() // this method name is id name for this {
		 * College college = new College(princibean());
		 * //college.setPrincipal(princibean()); return college; }
		 */
	 
}
