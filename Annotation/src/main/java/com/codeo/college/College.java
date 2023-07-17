package com.codeo.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class College {
    
	@Value("${college.Name}")
	private String CollegeName;
	@Value("${college.num}")
	private int num;
	@Autowired
	private Principal principal;
	@Autowired
	@Qualifier("scieneceTeacher")  // choose one class from many clASSES+
	private Teacher teacher;
	
	/*
	 *  public Principal getPrincipal() { return principal;
	 * }
	 * 
	 * public void setPrincipal(Principal principal) { this.principal = principal; }
	 * 
	 * public Teacher getTeacher() { return teacher; }
	 */
	//@Autowired
	/*
	 * public void setTeacher(Teacher teacher) { this.teacher = teacher; }
	 */

	
	  //public College(Principal principal) { this.principal = principal; }
	 
	
		/*
		 * @Autowired public void setPrincipal(Principal principal) { this.principal =
		 * principal; }
		 */
	
	public void collegeBean()
	{
		principal.princii();
	  	System.out.println("this is college bean method");
		
	}

	public void BeanForTeacher()
	{  System.out.println(".............................");
		teacher.teach();
		System.out.println(CollegeName);
		System.out.println(num);
		System.out.println(teacher.NoOfTeacher);
	}
	
}
