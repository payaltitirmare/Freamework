package com.codeo.NewStart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CallingPractice {

	private Practice practice;
	
	@Value("${callingPractice.number}")
	private String number ;
	
	public Practice getPractice() {
		return practice;
	}
 @Autowired
	public void setPractice(Practice practice) {
		this.practice = practice;
	}


	public void m1()
	{
		System.out.println("the variable is :"+ practice);
		practice.pract();
		System.out.println(number);
		System.out.println("this is calling class  method....");
	}
	
}
