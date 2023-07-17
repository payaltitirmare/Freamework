package com.codeo.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class School {

	@Autowired
	private Study study;
	@Value(value = "22+11")
	private String name;
	@Value("#{22+11}")
	private int x;
	
	/*
	 * public School(Study study) { this.study=study;
	 * 
	 * System.out.println("this is constructor.."); }
	 */
	
	public School()
	{
		System.out.println("constructor...");
	}
	
	

	public void schoolTeaching()
	{
		System.out.println("this is school class");
		study.doHomework();
		System.out.println(name);
		System.out.println(x);
	}
	
}
