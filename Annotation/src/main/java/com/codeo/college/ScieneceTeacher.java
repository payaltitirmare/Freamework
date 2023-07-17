package com.codeo.college;

import org.springframework.stereotype.Component;
@Component
public class ScieneceTeacher implements Teacher {

	
	public void teach() {
		System.out.println("this is science teacher......");
	}

}
