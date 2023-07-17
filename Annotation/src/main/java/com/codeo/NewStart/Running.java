package com.codeo.NewStart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Running {

	public static void main(String[] args) {
		                                                                         //need to define config class name here where the configuration is available ....s
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PracticeConfig.class);
	
	CallingPractice calling = context.getBean("callingPractice",CallingPractice.class);
	calling.m1();
	
	System.out.println("the code excuted properly....");
	
	}

}
