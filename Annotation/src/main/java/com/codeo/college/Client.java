package com.codeo.college;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		
	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(CollegeConfig.class);
	   
	College college =context.getBean("college",College.class);
	
	college.collegeBean();
	college.BeanForTeacher();
	
	context.close();
	}

}
