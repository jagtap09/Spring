package com.jbk.entity;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MessageAspect {
	/*@Before("execution( public void recharge())")
	public void beforeMSG() {
		System.out.println("Your Recharge Expring Soon Please recharge....");
		
	}
	@After("execution(public void recharge())")
	public void afterMSG() {
		System.out.println("Enjoy your pack...");
	}*/
	@Around("execution(* com.jbk.entity.MoblieRecharge.*(..))")
	    public void aroundMSG(ProceedingJoinPoint pj) {
	        System.out.println("Your recharge is expiring soon. Please recharge...");
	        
	        try {
	            // Proceed with the method execution
	            pj.proceed();
	        } catch (Throwable e) {
	            e.printStackTrace();
	        }
	        
	        System.out.println("Enjoy your data pack...");
	    }
	
	
	}
	
	


