package com.codeo.App;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class HelloSpringApp {

	public static void main(String[] args) {
		
	// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	 
	// retrieve bean from spring container
		Coach coach = context.getBean("coach",Coach.class);
		
		// call methods on the bean
	
			// close the context	
		System.out.println(coach.getDailyWorkout());
	}

}
