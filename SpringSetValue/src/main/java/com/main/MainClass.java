package com.main;
import com.entity.ExampleStudent;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("springbeans.xml");
		
		ExampleStudent studentProperty= context.getBean("studentProperty",ExampleStudent.class);
		
		System.out.println(studentProperty);
		
	    ExampleStudent studentConstructor=context.getBean("studentConstructor",ExampleStudent.class);
		System.out.println(studentConstructor);
	
		
		

		
	}

}
