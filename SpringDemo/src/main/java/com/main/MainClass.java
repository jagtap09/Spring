package com.main;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Student;

public class MainClass {

	public static void main(String[] args) {
		
		// crating object using the IOC or crating the bean of student class 
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		Student s=context.getBean("std",Student.class);
		
	/*	// set value in the main class 
		
		
		s.setStud_id(1);
		s.setStud_age(28);
		s.setStud_city("pune");
		s.setStud_name("ram");
		System.out.println(s);
		
		// set value in the main class 

		s.setStud_id(2);
		s.setStud_age(23);
		s.setStud_city("nashik");
		s.setStud_name("om");
		System.out.println(s);
		*/
		
		System.out.println(s);
		System.out.println(s);


		
		
	}

}
