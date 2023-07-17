package com.codeo.college;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //make it primary class..
public class MathTeacher implements Teacher {
    
	
	
	public void teach() {
		System.out.println("hii.. i am your math teacher..");
		System.out.println("hii my name is saurabh");
	}

}
