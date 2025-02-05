package com.jbk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jbk.config.MyConfigClass;
import com.jbk.entity.MoblieRecharge;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(MyConfigClass.class);
		
		MoblieRecharge mb=context.getBean(MoblieRecharge.class);
		mb.recharge();
	}

}
