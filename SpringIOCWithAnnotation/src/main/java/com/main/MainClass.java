package com.main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

import com.configration.MyConfigClass;
import com.entity.Employee;
public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigClass.class);
		
		Employee e= context.getBean(Employee.class);
		// using the setter 
		e.setEmp_id(1);
		e.setEmp_name("riye");
		e.setSalary(30000);
		System.out.println(e);
		
		
	}

}
