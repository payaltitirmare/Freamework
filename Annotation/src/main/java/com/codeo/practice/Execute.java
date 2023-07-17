package com.codeo.practice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SchoolConfig.class);
	 
		School scl =context.getBean("school", School.class);
		scl.schoolTeaching();
		
	}

}
