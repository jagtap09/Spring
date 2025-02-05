package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.entity.Employee;
@Configuration
public class MyConfigClass {
	
	@Bean
	public Employee empOBJ(){
		return new Employee();
	}
}
