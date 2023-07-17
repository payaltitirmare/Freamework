package com.codeo.practice;

import org.springframework.stereotype.Component;

@Component
public class Student implements Study{

	@Override
	public void doHomework() {
		System.out.println("complete your homework......");
	}

	@Override
	public String maths() {
		
		return "Do your maths study and learn formulas";
	}

	
}
